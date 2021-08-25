package com.quanglv.web.rest;

import com.quanglv.repository.DistrictsRepositoryCustom;
import com.quanglv.service.dto.DistrictsDTO;
import com.quanglv.service.dto.ProvinceCustomDto;
import com.quanglv.service.dto.ProvincesResponseDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "")
public class ProvincesController {
    @Autowired
    private DistrictsRepositoryCustom repository;

    @GetMapping(value = "/province")
    public ResponseEntity<?> getProvinces() {
        List<ProvincesResponseDTO> response = new ArrayList<>();

        List<ProvinceCustomDto> provinces = repository.getProvinceDistrict();

        Map<Long, String> mapProv = new HashMap<>();

        provinces.forEach(p -> {
            mapProv.put(p.getProvinceId(), p.getProvinceName());
        });

        mapProv.forEach((k, v) -> {
            ProvincesResponseDTO provinceCustomDto = new ProvincesResponseDTO();
            List<DistrictsDTO> districts = new ArrayList<>();
            provinces.forEach(p -> {
                if (StringUtils.equals(k.toString(), p.getProvinceId().toString())) {
                    DistrictsDTO district = new DistrictsDTO();
                    district.setDistrictId(p.getDistrictId());
                    district.setDistrictName(p.getDistrictName());
                    districts.add(district);
                }
            });
            provinceCustomDto.setProvinceId(k);
            provinceCustomDto.setProvinceName(v);
            provinceCustomDto.setDistricts(districts);
            response.add(provinceCustomDto);
        });
        return ResponseEntity.ok(response);
    }
}
