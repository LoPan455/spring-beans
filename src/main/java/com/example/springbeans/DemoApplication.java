package com.example.springbeans;

import com.example.springbeans.config.CompanyConfig;
import com.example.springbeans.model.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfig.class);
		Company company = context.getBean("company", Company.class);
		System.out.println(company.getState());
		System.out.println(company.getIndustry());
	}

}
