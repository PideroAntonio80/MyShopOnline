package com.sanvalero.myshop.repository;

import com.sanvalero.myshop.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Set<Product> findAll();
    Product findByName(String name);
    Set<Product> findByNameAndPrice(String name, float price);
}
