package com.quanglv.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "district")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Districts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "district_id")
    private Long districtId;
    @Column(name = "district_name")
    private String districtName;
    @Column(name = "province_id")
    private Long provinceId;
}
