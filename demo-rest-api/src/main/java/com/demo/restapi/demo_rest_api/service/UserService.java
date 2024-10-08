package com.demo.restapi.demo_rest_api.service;

import com.demo.restapi.demo_rest_api.entity.UserEntity;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.User.Company;

public interface UserService {

    User[] getUsers();
    User getUserById(Integer id);
    UserEntity createNewUser(String name, String email, String phone);
}
