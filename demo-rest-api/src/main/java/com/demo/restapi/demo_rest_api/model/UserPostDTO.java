package com.demo.restapi.demo_rest_api.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserPostDTO {
  private Long userID;
  private String username;
  private String useremail;
  private List<PostDTO> postDTO;
}
