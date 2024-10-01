package com.example.calculator.demo_sb_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan			whole world componect scan

//When server starts, scan whole spring project 
//to find all component annotation

// what is component, 
//@Service, @Controller, @Configuration, @Repository
//4 above class will make bean and put into Spring context
//all that bean is stateless, all method can use the same bean(object)!!!

//sir see sir

public class DemoSbCalculatorApplication {

	public static ConfigurableApplicationContext springContext;

	public static void main(String[] args) {
		String s = "abc";  // String oject in heap memory
		//static method

		DemoSbCalculatorApplication.springContext = 
		SpringApplication.run(DemoSbCalculatorApplication.class, args);

		System.out.println(springContext);
	}

	//Spring boot Application
	//1.main code compile OK , clean
	//2. Server start -> Compoent scan -> Create component -> Prepare spring context
	//3. Runtime -> Client (broswer) able to call the server

	//Spring = DI + IOC ( Dependency Injection ) ( Inverse of Control <Autowired> ) < not you create Bean 
	//Spring create Bean

}
