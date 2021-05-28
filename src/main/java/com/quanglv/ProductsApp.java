package com.quanglv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EnableResourceServer
public class ProductsApp implements WebMvcConfigurer {

    private static final String UPLOAD_PATH = "/src/main/file/";

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ProductsApp.class, args);
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        String pathUpload = "file:///" + System.getProperty("user.dir").replaceAll("\\\\", "/") + UPLOAD_PATH;
        registry.addResourceHandler("/file/**").addResourceLocations(pathUpload);
    }
}
