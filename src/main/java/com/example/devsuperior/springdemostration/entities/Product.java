package com.example.devsuperior.springdemostration.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.core.codec.StringDecoder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Product {
    private long id;
    private String name;
    private Double price;

    // association
    private Departament departament;

}
