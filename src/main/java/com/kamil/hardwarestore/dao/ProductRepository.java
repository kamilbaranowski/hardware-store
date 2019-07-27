package com.kamil.hardwarestore.dao;

import com.kamil.hardwarestore.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
