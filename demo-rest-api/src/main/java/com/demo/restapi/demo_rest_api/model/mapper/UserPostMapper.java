package com.demo.restapi.demo_rest_api.model.mapper;

import org.springframework.stereotype.Component;
import com.demo.restapi.demo_rest_api.model.Post;
import com.demo.restapi.demo_rest_api.model.UserPostDTO;

@Component
public class UserPostMapper {

  public UserPostDTO map(Post post){
    return UserPostDTO.builder()
    .userID(post.getUserId())
    .username(null)
    .useremail(null)
    .postDTO(null)
    .build();
   }
  
}
