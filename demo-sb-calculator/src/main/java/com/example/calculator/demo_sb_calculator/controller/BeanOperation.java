package com.example.calculator.demo_sb_calculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

public interface BeanOperation {

  @GetMapping(value = "/beans")
  List<String> getBean();
}
