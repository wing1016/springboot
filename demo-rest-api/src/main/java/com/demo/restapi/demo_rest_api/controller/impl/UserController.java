package com.demo.restapi.demo_rest_api.controller.impl;

import java.util.List;
import java.util.Optional;
// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restapi.demo_rest_api.controller.UserOperation;
import com.demo.restapi.demo_rest_api.entity.UserEntity;
import com.demo.restapi.demo_rest_api.exception.BusinessException;
import com.demo.restapi.demo_rest_api.exception.ErrorCode;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.UserRequest;
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

 @Override
  public UserEntity getUsersFromDBById(Long id) {
    Optional<UserEntity> userEntity = this.userService.getUsersFromDB(id);
    if (userEntity.isPresent()) {
      return userEntity.get();
    }
    throw new BusinessException(ErrorCode.USER_ID_NOT_FOUND);
  }

  @Override
  public void deleteUserFromDBById(Long id) {
    this.userService.deleteById(id);
  }


}
