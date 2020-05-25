package com.crud.spring.springbootcrudapp.repository;

import com.crud.spring.springbootcrudapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
