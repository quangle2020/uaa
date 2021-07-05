package com.quanglv.web.rest;

import com.quanglv.service.FilesService;
import com.quanglv.service.dto.FileUploadDTO;
import com.quanglv.service.dto.TestDTO;
import com.quanglv.utils.FileUploadUtils;
import com.quanglv.utils.error.CustomizeException;
import com.quanglv.service.dto.request.TestRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/file")
public class FilesResource {

    @Autowired
    private FilesService filesService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test(@ModelAttribute MultipartFile file) throws IOException {
        return ResponseEntity.ok(filesService.uploadFile(file));
    }

    @GetMapping("/download/template")
    public ResponseEntity<Resource> downloadTemplate(@RequestParam String fileName) throws MalformedURLException {
        Resource resource = filesService.downloadTemplate(fileName);

        HttpHeaders header = new HttpHeaders();
        header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"");

        return ResponseEntity.ok()
                .headers(header)
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}
