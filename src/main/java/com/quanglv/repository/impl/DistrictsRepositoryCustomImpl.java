package com.quanglv.repository.impl;

import com.quanglv.repository.DistrictsRepositoryCustom;
import com.quanglv.service.dto.ProvinceCustomDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class DistrictsRepositoryCustomImpl implements DistrictsRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<ProvinceCustomDto> getProvinceDistrict() {
        Map<String, Object> parameters = new HashMap<>();
        String queryString = createQuery();
        List<ProvinceCustomDto> result = getResultList(queryString, "provinceDistrictMapping", null);
        return result;
    }

    private String createQuery() {
        StringBuilder query = new StringBuilder("SELECT p.province_id, p.province_name, d.district_id, d.district_name FROM province p ");
        query.append("JOIN district d ON p.province_id = d.province_id");
        return query.toString();
    }


    public <T> List<T> getResultList(String sql, String resultSetMappingName, Map<String, Object> parameters) {

        try {
            Query query = createQuery(entityManager, sql, resultSetMappingName, parameters);
            return query.getResultList();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    private Query createQuery(EntityManager entityManager, String sql, String resultSetMappingName,
                              Map<String, Object> parameters) {
        Query query;
        if (StringUtils.isEmpty(resultSetMappingName)) {
            query = entityManager.createNativeQuery(sql);
        } else {
            query = entityManager.createNativeQuery(sql, resultSetMappingName);
        }

        if (Objects.isNull(parameters))
            return query;

        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query;
    }
}
