package com.demo.restapi.demo_rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.UserRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface UserOperation {

  
  @GetMapping(value = "/users")
  public User[] getUsers();
  
  @GetMapping(value = "/user")
  public User getUserById(@RequestParam Integer id);  

  @PostMapping(value= "/create/user")
  @ResponseStatus(HttpStatus.CREATED)
  public User createNewUser(@RequestBody UserRequest userForm);


  //@PostMapping      //create from zero to a new record
  //@PatchMapping     // update only 1 coloumn, 1 field
  //@DeleteMapping

  //PutMapping  -> change row
  //PatchMapping -> change colomn

    // @PutMapping // 改row
  // @PatchMapping // 改column
  // @DeleteMapping
  
}
