package com.demo.restapi.demo_rest_api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restapi.demo_rest_api.controller.PostOperation;
import com.demo.restapi.demo_rest_api.model.NewPost;
import com.demo.restapi.demo_rest_api.model.Post;
import com.demo.restapi.demo_rest_api.model.mapper.PostMapper;
import com.demo.restapi.demo_rest_api.service.PostService;

@RestController
public class PostController implements PostOperation{
  @Autowired
  private PostService postService;

  @Autowired
  private PostMapper postMapper;

  @Override
  public Post[] getPosts() {
    return postService.getPosts();
  }  

  @Override
  public Post getPostById(@PathVariable Long id){
    return postService.getPostById(id);
  };

  @Override
  public Post createNewPost( NewPost newPost){
    Long userId = newPost.getUserId();
    String title = newPost.getTitle();
    String body = newPost.getBody();
    System.err.println(" userId :" + userId + " " + title);
    return postMapper.map(postService.createNewPost(userId, title, body));
   };
}
