package com.kamil.hardwarestore.service;

import com.kamil.hardwarestore.dao.ProductRepository;
import com.kamil.hardwarestore.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public void saveProduct(Product product){
        this.productRepository.save(product);
    }

    public Product getProductById(int productId){
        Optional<Product> product = this.productRepository.findById(productId);
        return product.orElseThrow(() -> new EmptyResultDataAccessException("No product found with id: " + productId, 1));
    }
}
