package com.demo.restapi.demo_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.restapi.demo_rest_api.entity.UserEntity;

@Repository //This is a Bean
public interface UserRepository extends JpaRepository<UserEntity, Long >{ // here put primary key type
  
}
