package com.example.devsuperior.springdemostration.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "tb_product")
@Getter
@Setter
@SuperBuilder
public class Product {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double price;

    // association
    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departament departament;

    public Product() {
    }
    public Product(long id, String name, Double price, Departament departament) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.departament = departament;
    }

}
