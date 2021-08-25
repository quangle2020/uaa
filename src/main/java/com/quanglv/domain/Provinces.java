package com.quanglv.domain;

import com.quanglv.service.dto.ProvinceCustomDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "province")
@Data
@NoArgsConstructor
@AllArgsConstructor

@SqlResultSetMapping(
        name = "provinceDistrictMapping",
        classes = {
                @ConstructorResult(targetClass = ProvinceCustomDto.class, columns = {
                        @ColumnResult(name = "province_id", type = Long.class),
                        @ColumnResult(name = "province_name", type = String.class),
                        @ColumnResult(name = "district_id", type = Long.class),
                        @ColumnResult(name = "district_name", type = String.class),
                })
        })
public class Provinces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "province_id")
    private Long provinceId;
    @Column(name = "province_name")
    private String provinceName;
}
