package com.quanglv.repository;

import com.quanglv.service.dto.ProvinceCustomDto;

import java.util.List;

public interface DistrictsRepositoryCustom {
    List<ProvinceCustomDto> getProvinceDistrict();
}
