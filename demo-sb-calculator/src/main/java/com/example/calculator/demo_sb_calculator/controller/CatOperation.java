package com.example.calculator.demo_sb_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.calculator.demo_sb_calculator.model.Cat;

public interface CatOperation {
  
  @GetMapping(value = "/cat")
  String getCatName();


  //Update resourse
  @PutMapping(value = "/cat/{newName}")
  String updateCatName(@PathVariable String newName);
  
}
