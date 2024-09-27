package com.demo.restapi.demo_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.demo.restapi.demo_rest_api.model.User;

public interface UserOperation {

  @GetMapping("/users")
  User[] getUsers();
  
}
