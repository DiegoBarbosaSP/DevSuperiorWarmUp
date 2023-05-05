package com.example.devsuperior.springdemostration.repositories;

import com.example.devsuperior.springdemostration.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
