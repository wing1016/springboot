package com.demo.restapi.demo_rest_api.service;

import org.springframework.stereotype.Service;
import com.demo.restapi.demo_rest_api.model.User;


public interface UserService {
    User[] getUsers();
}
