package com.quanglv.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class FileConfig {

    @Value("${file.templateDirectory}")
    private String templateDirectory;

    @Value("${file.rootDirectory}")
    private String rootDirectory;

    @Value("${file.productsDirectory}")
    private String productsDirectory;
}
