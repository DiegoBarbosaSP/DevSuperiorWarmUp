package com.example.devsuperior.springdemostration.controller;

import com.example.devsuperior.springdemostration.entities.Departament;
import com.example.devsuperior.springdemostration.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObject(){
        Departament di = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Pet");

        Product p1 = new Product(1L, "Macbook Pro", 4000.00,di);
        Product p2 = new Product(2L, "Pc Gamer", 5000.00,di);
        Product p3 = new Product(3L, "Macbook Pro", 4000.00,d2);

        List<Product> list = Arrays.asList(p1,p2,p3);


        return list;
    }
}
