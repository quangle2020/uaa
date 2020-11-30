package com.quanglv.web.rest.request;

import com.quanglv.domain.Employees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateEmployeesRequest implements Serializable {
    private List<Employees> employees;
}
