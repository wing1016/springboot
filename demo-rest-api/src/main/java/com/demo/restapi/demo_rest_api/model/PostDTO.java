package com.demo.restapi.demo_rest_api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostDTO {

  private Long id;
  private Long userId;
  private String title;
  private String body;

}
