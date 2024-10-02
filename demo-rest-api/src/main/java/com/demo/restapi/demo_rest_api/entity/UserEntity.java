package com.demo.restapi.demo_rest_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // ask spring to create table if there is table not exists
@Table(name = "Users")
@Getter
@Setter
public class UserEntity {
  @Id //Primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-increment
  private Long id; 

  private String name;

  private String username;

  @Column(name = "useremail") //to custum coloumn name 
  private String email;

  private String phone;

  private String website;  

}
