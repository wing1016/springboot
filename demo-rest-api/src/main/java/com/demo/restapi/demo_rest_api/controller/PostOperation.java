package com.demo.restapi.demo_rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.demo.restapi.demo_rest_api.model.NewPost;
import com.demo.restapi.demo_rest_api.model.Post;

public interface PostOperation {
  
  @GetMapping("/posts")
  public Post[] getPosts(); 

  @GetMapping("/post/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Post getPostById(@PathVariable Long id);


  @PostMapping(value = "/create/post") // CREATE -> 0 to 1
  @ResponseStatus(HttpStatus.CREATED)
  public Post createNewPost( @RequestBody NewPost newPost);




}
