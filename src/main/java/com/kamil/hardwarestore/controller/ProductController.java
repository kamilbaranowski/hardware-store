package com.kamil.hardwarestore.controller;


import com.kamil.hardwarestore.model.ProductWrapper;
import com.kamil.hardwarestore.model.entity.Product;
import com.kamil.hardwarestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Product product){
        this.productService.saveProduct(product);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
