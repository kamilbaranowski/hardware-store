package com.kamil.hardwarestore.controller;


import com.kamil.hardwarestore.model.ProductWrapper;
import com.kamil.hardwarestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ProductWrapper getProducts(){
        return new ProductWrapper(productService.getAllProducts());
    }
}
