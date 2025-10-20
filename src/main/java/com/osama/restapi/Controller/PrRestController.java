package com.osama.restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.osama.restapi.entities.Product;
import com.osama.restapi.repos.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class PrRestController {

    @Autowired
    ProductRepository repository;
    
    @GetMapping("/products/")
    public List<Product> getProducts() { 
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") int id) { 
        return repository.findById(id).get();
    }
}
