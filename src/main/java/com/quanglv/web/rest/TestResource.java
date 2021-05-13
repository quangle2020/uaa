package com.quanglv.web.rest;

import com.quanglv.service.dto.TestDTO;
import com.quanglv.utils.error.CustomizeException;
import com.quanglv.web.rest.request.TestRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/public")
public class TestResource {

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test (@ModelAttribute TestRequest request){
        return ResponseEntity.ok(new TestDTO(request.getFile().getOriginalFilename()));
    }

    @GetMapping(value = "/{id}")
    public String test1(@PathVariable String id){
        if(id.equals("1"))
            throw new CustomizeException("Không có id = 1", "id", "ERROR_0012");
        else if(id.equals("2")){
            List<Map<String,Object>> errList = new ArrayList<>();
            errList.add(CustomizeException.putError("Không có id = 1", "id1", "ERROR_0011"));
            errList.add(CustomizeException.putError("Không có id = 1", "id2", "ERROR_0012"));
            errList.add(CustomizeException.putError("Không có id = 1", "id3", "ERROR_0013"));
            errList.add(CustomizeException.putError("Không có id = 1", "id4", "ERROR_0014", 41));
            throw new CustomizeException(errList);
        }
        return "succsess";
    }
}
