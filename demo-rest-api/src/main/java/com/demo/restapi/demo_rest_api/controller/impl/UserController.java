package com.demo.restapi.demo_rest_api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restapi.demo_rest_api.controller.UserOperation;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.UserRequest;
import com.demo.restapi.demo_rest_api.model.User.Company;
import com.demo.restapi.demo_rest_api.model.mapper.UserMapper;
import com.demo.restapi.demo_rest_api.service.UserService;

@RestController // @Controller + @Response
public class UserController implements UserOperation{

  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper userMapper;

  @Override
  public User[] getUsers() {
    return userService.getUsers();
  }  

  @Override
  public User getUserById(@RequestParam Integer id) {
    return userService.getUserById(id);  
  }

  @Override
  public User createNewUser(UserRequest userForm) {
     String name = userForm.getName();
     String email = userForm.getEmail();
     String phone = userForm.getPhone();
  

  //   return userService.createUser

     return userMapper.map(userService.createNewUser(name, email, phone));

  }



}
