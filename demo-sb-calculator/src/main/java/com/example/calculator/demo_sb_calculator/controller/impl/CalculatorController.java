package com.example.calculator.demo_sb_calculator.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CalculatorController {

  @GetMapping(value = "/sum/{a}/{b}")
  public int sum(@PathVariable(value = "a") int x,
      @PathVariable(value = "b") int y) {
    return x + y;
  }

  @GetMapping(value = "/div/{x}/{y}")
  public String divide(@PathVariable int x, @PathVariable int y) {
    try {
      return String.valueOf(x / y);

    } catch (ArithmeticException e) {
      return "not support divide by 0";     //sir
    }
  }

  // Path param is a String value, So we get as String is better than get path param as Long
  @GetMapping(value = "/sub/{a}/{b}")
  public String subtract(@PathVariable(value = "a") String x,
      @PathVariable(value = "b") String y) { // autobox
    // return x - y;
    try {
      return String.valueOf(Long.parseLong(x) - Long.parseLong(y));
    } catch (NumberFormatException e) {
      return "Input param should be a number";
    }
  }

  //How to check myself is overflow ?

}
