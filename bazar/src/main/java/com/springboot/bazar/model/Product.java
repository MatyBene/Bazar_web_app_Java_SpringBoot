package com.springboot.bazar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long productId;
    private String name;
    private String brand;
    private Double cost;
    private Double stock;

}
