package com.demo.restapi.demo_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.restapi.demo_rest_api.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{
  
}
