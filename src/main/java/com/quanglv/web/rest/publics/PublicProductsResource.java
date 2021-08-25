package com.quanglv.web.rest.publics;

import com.quanglv.service.ProductsService;
import com.quanglv.service.dto.ProductsDTO;
import com.quanglv.service.dto.ProductsSearchRequestDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "")
public class PublicProductsResource {

    @Autowired
    private ProductsService productsService;

    @PostMapping(value = "/products/search", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search(@RequestBody ProductsSearchRequestDTO request) {
        return ResponseEntity.ok(productsService.search(request));
    }
}
