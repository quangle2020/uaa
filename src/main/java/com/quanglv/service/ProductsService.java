package com.quanglv.service;

import com.quanglv.domain.Products;

import java.util.List;

public interface ProductsService {

    List<Products> getAll();

    Products save(Products request);
}
