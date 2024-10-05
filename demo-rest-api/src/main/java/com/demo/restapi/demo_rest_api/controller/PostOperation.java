package com.demo.restapi.demo_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.demo.restapi.demo_rest_api.model.Post;

public interface PostOperation {
  
  @GetMapping("/posts")
  public Post[] getPosts(); 

  @GetMapping("/post/{id}")
  public Post getPostById(@PathVariable Long id);


}
