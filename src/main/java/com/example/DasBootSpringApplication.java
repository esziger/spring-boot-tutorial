package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DasBootSpringApplication {

	public static void main(String[] args) {
		//This starts spring, creates spring context, applies annotations and sets up container.
		SpringApplication.run(DasBootSpringApplication.class, args);
	}
}
