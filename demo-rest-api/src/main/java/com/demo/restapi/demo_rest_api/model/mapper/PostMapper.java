package com.demo.restapi.demo_rest_api.model.mapper;

import org.springframework.stereotype.Component;
import com.demo.restapi.demo_rest_api.entity.PostEntity;
import com.demo.restapi.demo_rest_api.model.Post;


@Component
public class PostMapper {

  public PostEntity map(Post post){

    System.err.println(post.getId());
    System.err.println(post.getBody());


    return PostEntity.builder()
    .userId(post.getUserId())
    .id(post.getId())
    .title(post.getTitle())
    .body(post.getBody())
    .build();
  }

}
