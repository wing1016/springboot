package com.demo.restapi.demo_rest_api.service;

import com.demo.restapi.demo_rest_api.model.UserPostDTO;

public interface DtoService {
  public UserPostDTO getUserPostDTO(String userID, String postID);
}
