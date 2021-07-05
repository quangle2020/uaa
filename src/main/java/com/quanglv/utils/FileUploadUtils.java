package com.quanglv.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.UUID;

@Component
public class FileUploadUtils {

    private String getExtensionFile(String fileName) {
        String extension = "";

        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i);
        }
        return extension;
    }

    public String genNewFileName(String fileName) {
        return new StringBuilder()
                .append(UUID.randomUUID().toString())
                .append(getExtensionFile(fileName))
                .toString();
    }
}
