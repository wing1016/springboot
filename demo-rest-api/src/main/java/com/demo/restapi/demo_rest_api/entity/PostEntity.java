package com.demo.restapi.demo_rest_api.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
public class PostEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  //  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGen")
  //  @SequenceGenerator(name = "mySeqGen", sequenceName = "my_sequence_name", allocationSize = 100)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long  userId;
  private String title;
  private String body;
  
}
