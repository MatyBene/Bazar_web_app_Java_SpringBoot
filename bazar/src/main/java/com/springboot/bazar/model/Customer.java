package com.springboot.bazar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long customerId;
    private String firstName;
    private String lastName;
    private String dni;

}
