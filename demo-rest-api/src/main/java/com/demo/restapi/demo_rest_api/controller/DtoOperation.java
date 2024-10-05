package com.demo.restapi.demo_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.demo.restapi.demo_rest_api.model.UserPostDTO;

public interface DtoOperation {

  @GetMapping("/userpost/{userID}")
  UserPostDTO getUserPostDTO(@PathVariable String userID,
      @RequestParam(defaultValue = "0") String postID);

}
