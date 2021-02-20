package com.sanvalero.myshop.service;

import com.sanvalero.myshop.domain.Product;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */
public interface ProductService {

    Set<Product> findAllProducts();
    Set<Product> findAllProducts(String category);
    void increasePrice(Product product);
}
