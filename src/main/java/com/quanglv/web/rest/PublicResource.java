package com.quanglv.web.rest;

import com.quanglv.service.ProductsService;
import com.quanglv.service.dto.ProductsSearchRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class PublicResource {

    @Autowired
    private ProductsService productsService;

    @PostMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search(@RequestBody ProductsSearchRequestDTO request){
        return ResponseEntity.ok(productsService.search(request));
    }
}
