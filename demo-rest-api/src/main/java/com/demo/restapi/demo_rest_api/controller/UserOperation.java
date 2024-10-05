package com.demo.restapi.demo_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.demo.restapi.demo_rest_api.model.User;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserOperation {

  
  @GetMapping(value = "/users")
  User[] getUsers();
  
  @GetMapping(value = "/user")
  public User getUser(@RequestParam Integer id);  


  //@PostMapping      //create from zero to a new record
  //@PatchMapping     // update only 1 coloumn, 1 field
  //@DeleteMapping
  
}
