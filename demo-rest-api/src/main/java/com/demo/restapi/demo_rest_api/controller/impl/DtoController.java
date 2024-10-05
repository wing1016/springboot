package com.demo.restapi.demo_rest_api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restapi.demo_rest_api.controller.DtoOperation;
import com.demo.restapi.demo_rest_api.model.UserPostDTO;
import com.demo.restapi.demo_rest_api.service.DtoService;

@RestController
public class DtoController implements DtoOperation{

  @Autowired
  private DtoService dtoService;

  @Override
  public  UserPostDTO getUserPostDTO(@PathVariable String userID,
      @RequestParam(defaultValue = "0") String postID){
        UserPostDTO u = dtoService.getUserPostDTO(userID, postID);
        System.out.println("#####################");
        System.out.println(u.toString());
        return dtoService.getUserPostDTO(userID, postID);
      };
  
}
