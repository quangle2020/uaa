package com.quanglv.service.impl;

import com.quanglv.config.FileConfig;
import com.quanglv.service.FilesService;
import com.quanglv.utils.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    private FileConfig fileConfig;

    @Autowired
    private FileUploadUtils fileUploadUtils;

    @Override
    public Resource downloadTemplate(String fileName) throws MalformedURLException {
        String url = fileConfig.getTemplateDirectory() + fileName;
        Resource resource = new UrlResource(url);
        if (!resource.exists())
            return null;
        return resource;
    }

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        Path path = Paths.get(fileConfig.getProductsDirectory().replace("file:", ""));

        if (!Files.exists(path))
                Files.createDirectories(path);

        Files.copy(file.getInputStream(), path.resolve(fileUploadUtils.genNewFileName(file.getOriginalFilename())), StandardCopyOption.REPLACE_EXISTING);

        return path.toAbsolutePath().toString();
    }
}
