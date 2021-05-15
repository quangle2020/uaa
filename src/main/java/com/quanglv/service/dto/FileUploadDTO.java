package com.quanglv.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class FileUploadDTO {

    private MultipartFile file;
}
