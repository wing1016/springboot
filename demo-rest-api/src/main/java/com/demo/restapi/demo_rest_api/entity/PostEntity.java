package com.demo.restapi.demo_rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity // ask spring to create table if there is table not exists
@Table(name = "Posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {
  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long  userId;
  private String title;
  private String body;
  
}
