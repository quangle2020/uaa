package com.quanglv.web.rest.request;

import com.quanglv.domain.Products;
import com.quanglv.service.ProductsService;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/public/products")
public class ProductsResource {

    @Autowired
    private ProductsService productsService;

    @GetMapping(value = "/get-all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(productsService.getAll());
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Products request){
        return ResponseEntity.ok(productsService.save(request));
    }
}
