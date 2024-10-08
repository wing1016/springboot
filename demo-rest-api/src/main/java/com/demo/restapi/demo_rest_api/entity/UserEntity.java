package com.demo.restapi.demo_rest_api.entity;

import com.demo.restapi.demo_rest_api.model.User.Company;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@Entity // ask spring to create table if there is table not exists
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
  // private Company company;
}
