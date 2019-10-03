package com.example.springbeans.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
public class Address {

    private String street;

    private String number;

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }
}
