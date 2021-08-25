package com.quanglv.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvincesResponseDTO {
    private Long provinceId;
    private String provinceName;
    private List<DistrictsDTO> districts;
}
