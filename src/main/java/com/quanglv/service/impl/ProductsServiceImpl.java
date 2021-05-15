package com.quanglv.service.impl;

import com.quanglv.domain.Products;
import com.quanglv.repository.ProductsRepository;
import com.quanglv.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Products> getAll() {
        return productsRepository.findAll();
    }

    @Override
    @Transactional
    public Products save(Products request) {
        return productsRepository.save(request);
    }
}
