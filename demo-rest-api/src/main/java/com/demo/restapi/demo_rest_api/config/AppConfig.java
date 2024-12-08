package com.demo.restapi.demo_rest_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class AppConfig {

  @Bean
  RestTemplate restTemplate(){

    //create RestTemplate Bean to the Spring Context  
    return new RestTemplate();
  }
  
}
