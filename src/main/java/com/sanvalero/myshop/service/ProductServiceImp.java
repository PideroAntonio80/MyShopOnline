package com.sanvalero.myshop.service;

import com.sanvalero.myshop.domain.Product;
import com.sanvalero.myshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Set<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Set<Product> findAllProducts(String category) {
        return null;
    }

    @Override
    public void increasePrice(Product product) {

    }
}
