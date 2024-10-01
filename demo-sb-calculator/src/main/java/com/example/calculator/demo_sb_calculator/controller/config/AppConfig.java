package com.example.calculator.demo_sb_calculator.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.calculator.demo_sb_calculator.model.Cat;

@Configuration // this is a component
public class AppConfig {  // spring boot will > new AppConfig() 

  // !!! @Configuration + @Bean < always use together!!!
  // !!!@ Configuration is for open Bean
  
  @Bean(name = "John")
  Cat createCat(){  // Bean name will follow this method name!!!
    return new Cat("John");  // this is a cat bean called "John"
  }

  //if you new a cat directly , it is not in spring context!!!
  // if you autowired, then it will in spring context!!!
}


