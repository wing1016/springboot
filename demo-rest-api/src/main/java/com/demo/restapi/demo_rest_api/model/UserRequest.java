package com.demo.restapi.demo_rest_api.model;

import com.demo.restapi.demo_rest_api.model.User.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class UserRequest {  

  private String name;
  private String email;
  private String phone;
//private Company company;

}
