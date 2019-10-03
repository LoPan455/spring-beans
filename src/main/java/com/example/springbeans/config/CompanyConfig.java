package com.example.springbeans.config;


import com.example.springbeans.model.Address;
import com.example.springbeans.model.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class CompanyConfig {

    @Bean
    public Address address() {
        return new Address("High Street", "2841");
    }

    @Bean
    public String state() {
        return "Minnesota";
    }
}
