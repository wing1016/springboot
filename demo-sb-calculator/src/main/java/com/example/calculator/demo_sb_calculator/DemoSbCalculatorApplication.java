package com.example.calculator.demo_sb_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan			whole world componect scan

public class DemoSbCalculatorApplication {

	public static void main(String[] args) {
		String s = "abc";  // String oject in heap memory
		//static method
		SpringApplication.run(DemoSbCalculatorApplication.class, args);
	}

}
