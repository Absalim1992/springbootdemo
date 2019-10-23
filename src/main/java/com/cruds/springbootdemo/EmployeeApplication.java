package com.cruds.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan("com.cruds.springbootdemo")
public class EmployeeApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeApplication.class, args);
		
		System.out.println("Welcome to Spring Boot");
		

	}

}
