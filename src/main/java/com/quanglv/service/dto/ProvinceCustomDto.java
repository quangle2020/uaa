package com.quanglv.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceCustomDto {
    private Long provinceId;
    private String provinceName;
    private Long districtId;
    private String districtName;
}
