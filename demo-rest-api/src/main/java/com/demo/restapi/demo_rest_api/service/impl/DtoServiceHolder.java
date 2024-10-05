package com.demo.restapi.demo_rest_api.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.restapi.demo_rest_api.model.PostDTO;
import com.demo.restapi.demo_rest_api.model.UserPostDTO;
import com.demo.restapi.demo_rest_api.model.mapper.PostMapper;
import com.demo.restapi.demo_rest_api.service.DtoService;
import com.demo.restapi.demo_rest_api.service.PostService;
import com.demo.restapi.demo_rest_api.service.UserService;

@Service
public class DtoServiceHolder implements DtoService {

  // @Autowired
  // private PostMapper postMapper;

  @Autowired
  private PostService postService;

  @Autowired
  private UserService userService;

  @Override
  public UserPostDTO getUserPostDTO(String userID, String postID) {

    UserPostDTO userPostDTO = new UserPostDTO();
    String userName = userService.getUserById(Integer.valueOf(userID)).getName();
    String userEmail = userService.getUserById(Integer.valueOf(userID)).getEmail();

    List<PostDTO> posts = postService.getPostsByUserId(Long.valueOf(userID), Long.valueOf(postID));

    System.out.println(posts.toString());

    userPostDTO.setUserID(Long.valueOf(userID));
    userPostDTO.setUsername(userName);
    userPostDTO.setUseremail(userEmail);
    userPostDTO.setPostDTO(posts);

    System.out.println("----------------" + userPostDTO.getUserID());

    return userPostDTO;
  };
}
