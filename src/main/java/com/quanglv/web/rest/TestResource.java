package com.quanglv.web.rest;

import com.quanglv.service.dto.TestDTO;
import com.quanglv.web.rest.request.TestRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/public")
public class TestResource {

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test (@ModelAttribute TestRequest request){
        return ResponseEntity.ok(new TestDTO(request.getFile().getOriginalFilename()));
    }
}
