package com.quanglv.service;

import com.quanglv.service.dto.DownloadFileResponseDTO;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;

public interface FilesService {
    Resource downloadTemplate(String fileName) throws MalformedURLException;

    DownloadFileResponseDTO downloadFile(String fileId) throws MalformedURLException;

    String uploadFile(MultipartFile file) throws IOException;
}
