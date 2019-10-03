package com.example.springbeans.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Company {

    @Autowired
    private String state;

    String industry = "Mining";

    public Company() {
    }
    
    public String getState() {
        String state = this.state;
        return state;
    }


}
