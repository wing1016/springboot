package com.demo.restapi.demo_rest_api.model.mapper;

import org.springframework.stereotype.Component;
import com.demo.restapi.demo_rest_api.entity.PostEntity;
import com.demo.restapi.demo_rest_api.model.Post;


@Component
public class PostMapper {

  public PostEntity map(Post post){

    return PostEntity.builder()
    .userId(post.getUserId())
    .id(post.getId())
    .title(post.getTitle())
    .body(post.getBody())
    .build();
  }

  public Post map(PostEntity postEntity){
    return Post.builder()
    .userId(postEntity.getUserId()) //
    .title(postEntity.getTitle()) //
    .body(postEntity.getBody()) //
    .build();
  }

}
