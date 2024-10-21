package com.demo.restapi.demo_rest_api.service;

import java.util.Optional;
import com.demo.restapi.demo_rest_api.entity.UserEntity;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.User.Company;

public interface UserService {


    /**
     * Get User Data from jsonplaceholder website
     * 
     * @return
     */
    User[] getUsers();

    User getUserById(Integer id);

    UserEntity createNewUser(String name, String email, String phone);

    /**
     * Get User Data from Database
     * 
     * @return
     */
    Optional<UserEntity> getUsersFromDB(Long id);

    void deleteById(Long id);
}
