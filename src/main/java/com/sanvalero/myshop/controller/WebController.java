package com.sanvalero.myshop.controller;

import com.sanvalero.myshop.domain.Product;
import com.sanvalero.myshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */

@Controller
public class WebController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {

        Set<Product> products = productService.findAllProducts();
        model.addAttribute("products", products);
        // TODO Pintaré los productos en la web
        return "catalog";
    }
}
