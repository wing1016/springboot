package com.bootcamp.demo.demo_sb_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloworldController {

  // public String getMethodName(@RequestParam String param) {
  //   return new String();
  // }
  
  @GetMapping(value = "/hello")
  public String greeting(){
    return "Hello";
  }

  @GetMapping(value = "/bye")
  public String goodBye(){
    System.out.println("---   ---  debug  ---   --- ");
    System.err.println("---   ---  debug  ---   --- ");
    return "Good Bye!!!";
  }
  
}
