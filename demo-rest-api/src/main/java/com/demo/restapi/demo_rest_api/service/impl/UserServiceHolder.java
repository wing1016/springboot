package com.demo.restapi.demo_rest_api.service.impl;

import java.util.Arrays;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.demo.restapi.demo_rest_api.bootcamp.Scheme;
import com.demo.restapi.demo_rest_api.bootcamp.UrlManager;
import com.demo.restapi.demo_rest_api.entity.UserEntity;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.mapper.UserMapper;
import com.demo.restapi.demo_rest_api.repository.UserRepository;
import com.demo.restapi.demo_rest_api.service.UserService;

@Service // become a bean for other ppl
public class UserServiceHolder implements UserService {

  // Call Api
  // put url here , we need to compile again , if the url is changed.!!!
  // because here is part of code
  // private static final String url = "https://jsonplaceholder.typicode.com/users";

  // ! @Value: before @Service bean created ( before server start )
  // Spring help to find "api.url" value from application.yml
  @Value("${api.url.domain}")
  private String domain;

  @Value("${api.url.endpoint}")
  private String endpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserMapper userMapper;

  // Constructor injection example!!!
  // @Autowired
  // public UserServiceHolder(String d, String e, RestTemplate r){
  // this.domain = d;
  // this.endpoint = e;
  // this.restTemplate = r;
  // }

  @Override
  public User getUser(Integer id) {
    User us = new User();
    String url = UrlManager.builder().scheme(Scheme.HTTPS).domain(this.domain)
    .endpoint(this.endpoint).build().toString();
    User[] users = this.restTemplate.getForObject(url, User[].class);

    for (User user : users) {
      if (user.getId() == id) {
        us = user;
        break;
      }
    }
    return us;
  }

  @Override
  public User[] getUsers() {

    // We received a User Array from jsonplaceholder.com
    // getForObject(): call API + serialize result and convert to User[]

    String url = UrlManager.builder().scheme(Scheme.HTTPS).domain(this.domain)
        .endpoint(this.endpoint).build().toString();
    User[] users = this.restTemplate.getForObject(url, User[].class);

    if (userRepository.findAll().size() == 0) {
      Arrays.asList(users).stream().forEach(user -> {
        UserEntity userEntity = userMapper.map(user);
        // Save the UserEntity to the database
        userRepository.save(userEntity);
      });
    } else {
      System.out.println("Already have data.");
    }

    return users;

    // .Stream > insert into DB
    // Open posts entity

    // User[] u = new RestTemplate().getForObject(url, User[].class);
    // !!! we dont want to new a RestTeamplate on every request,
    // So we make it Beanable by AppConfig, @Configuration & @Bean!!!

    // System.out.println(Arrays.toString(u));
    // return new RestTemplate().getForObject(url, User[].class);

  }
}






// Wing version
// UserEntity userEntity = new UserEntity();
// userEntity.setName(user.getName());
// userEntity.setUsername(user.getUsername());
// userEntity.setEmail(user.getEmail());
// userEntity.setPhone(user.getPhone());
// userEntity.setWebsite(user.getWebsite());
