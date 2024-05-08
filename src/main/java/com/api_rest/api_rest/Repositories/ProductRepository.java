package com.api_rest.api_rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_rest.api_rest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}