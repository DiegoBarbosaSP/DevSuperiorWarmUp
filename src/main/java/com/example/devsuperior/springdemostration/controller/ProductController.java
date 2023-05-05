package com.example.devsuperior.springdemostration.controller;

import com.example.devsuperior.springdemostration.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.devsuperior.springdemostration.repositories.ProductRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<Product> getObject(){


        List<Product> list = repository.findAll();


        return list;
    }
}
