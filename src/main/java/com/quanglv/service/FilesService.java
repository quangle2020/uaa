package com.quanglv.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;

public interface FilesService {
    Resource downloadTemplate(String fileName) throws MalformedURLException;

    Resource downloadFileExternal(String fileName) throws MalformedURLException;

    String uploadFile(MultipartFile file) throws IOException;
}
