package com.demo.restapi.demo_rest_api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restapi.demo_rest_api.controller.UserOperation;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.service.UserService;

@RestController // @Controller + @Response
public class UserController implements UserOperation{

  @Autowired
  private UserService userService;

  @Override
  public User[] getUsers() {
    return userService.getUsers();
  }  
}
