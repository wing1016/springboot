package com.demo.restapi.demo_rest_api.model.mapper;

import org.springframework.stereotype.Component;
import com.demo.restapi.demo_rest_api.entity.UserEntity;
import com.demo.restapi.demo_rest_api.model.User;

import lombok.Builder;

@Component
public class UserMapper {

  public UserEntity map(User user){
    return UserEntity.builder()
    .name(user.getName())
    .username(user.getUsername())
    .email(user.getEmail())
    .phone(user.getPhone())
    .website(user.getWebsite())
    .build(); //
  }
  
}
