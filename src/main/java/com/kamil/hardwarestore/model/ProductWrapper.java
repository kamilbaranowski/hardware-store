package com.kamil.hardwarestore.model;

import com.kamil.hardwarestore.model.entity.Product;

import java.util.List;

public class ProductWrapper {

    private List<Product> products;


    public ProductWrapper(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
