package com.springboot.bazar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    private Long saleId;
    private LocalDateTime saleDate;
    private Double total;
    private List<Product> productList;
    private Customer customer;

}
