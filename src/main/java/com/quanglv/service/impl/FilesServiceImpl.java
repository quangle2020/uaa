package com.quanglv.service.impl;

import com.quanglv.config.FilesConfig;
import com.quanglv.domain.FileStorages;
import com.quanglv.repository.FilesStoragesRepository;
import com.quanglv.service.FilesService;
import com.quanglv.service.dto.DownloadFileResponseDTO;
import com.quanglv.type.FileTypes;
import com.quanglv.type.StatusTypes;
import com.quanglv.utils.FileUploadUtils;
import com.quanglv.utils.error.ProductsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    private FilesConfig fileConfig;

    @Autowired
    private FileUploadUtils fileUploadUtils;

    @Autowired
    private FilesStoragesRepository filesStoragesRepository;

    @Override
    public Resource downloadTemplate(String fileName) throws MalformedURLException {
        String url = fileConfig.getTemplateDirectory() + fileName;
        Resource resource = new UrlResource(url);
        if (!resource.exists())
            return null;
        return resource;
    }

    @Override
    public DownloadFileResponseDTO downloadFile(String fileId) throws MalformedURLException {
        FileStorages entity = filesStoragesRepository.findById(fileId).orElse(null);

        if(Objects.isNull(entity))
            throw new ProductsException("File not found", "", "ERR_001");

        String url = fileConfig.getPublicDirectory()
                + "/" + entity.getFileName()
                + "." + entity.getFileExtension();

        Resource resource = new UrlResource(url);

        if (!resource.exists())
            throw new ProductsException("File not found", "", "ERR_001");

        return DownloadFileResponseDTO
                .builder()
                .resource(resource)
                .fileName(entity.getFileName() + "." + entity.getFileExtension())
                .build();
    }

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        Path path = Paths.get(fileConfig.getPublicDirectory().replace("file:", ""));

        if (!Files.exists(path))
            Files.createDirectories(path);

        String fileName = UUID.randomUUID().toString();
        String fileExtension = fileUploadUtils.getExtensionFile(file.getOriginalFilename());

        Files.copy(
                file.getInputStream(),
                path.resolve(fileName + "." + fileExtension),
                StandardCopyOption.REPLACE_EXISTING);

        return saveFileInfo(
                fileName,
                fileExtension,
                FileTypes.PUBLIC.getCode(),
                file.getSize());

    }

    private String saveFileInfo(String fileName, String fileExtension, String fileType, Long fileSize) {
        FileStorages entity = new FileStorages();
        entity.setId(UUID.randomUUID().toString());
        entity.setFileName(fileName);
        entity.setFileExtension(fileExtension);
        entity.setFilePath(fileType);
        entity.setFileType(fileType);
        entity.setFileSize(fileSize);
        entity.setStorageDays(1);
        entity.setStatus(StatusTypes.ACTIVE.getCode());
        entity.setCreatedDate(Instant.now());
        entity.setUpdatedDate(Instant.now());
        entity.setCreatedUser(1L);
        entity.setUpdatedUser(1L);
        return filesStoragesRepository.save(entity).getId();
    }
}
