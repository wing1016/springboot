package com.example.calculator.demo_sb_calculator.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.calculator.demo_sb_calculator.DemoSbCalculatorApplication;

@Service
public class BeanService {
    public List<String> getBean(){
      return Arrays.stream(DemoSbCalculatorApplication.springContext.getBeanDefinitionNames())
              .collect(Collectors.toList());
    }
}
