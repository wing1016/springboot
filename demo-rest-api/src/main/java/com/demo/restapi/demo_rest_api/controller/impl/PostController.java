package com.demo.restapi.demo_rest_api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.service.PostService;
import com.demo.restapi.demo_rest_api.service.UserService;
import com.demo.restapi.demo_rest_api.controller.PostOperation;
import com.demo.restapi.demo_rest_api.model.Post;

@RestController
public class PostController implements PostOperation{
  @Autowired
  private PostService postService;

  @Override
  public Post[] getPosts() {
    return postService.getPosts();
  }  
}
