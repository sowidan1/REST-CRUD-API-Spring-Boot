package com.osama.restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osama.restapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
