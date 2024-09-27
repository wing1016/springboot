package com.demo.restapi.demo_rest_api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.service.UserService;

@Service   // become a bean for other ppl 
public class UserServiceHolder implements UserService{

  //Call Api

  private static final String url = "https://jsonplaceholder.typicode.com/users";

  @Override
  public User[] getUsers(){
    return new  RestTemplate().getForObject(url, User[].class);
  // return User;
  }
  
}
