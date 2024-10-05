package com.demo.restapi.demo_rest_api.service.impl;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.demo.restapi.demo_rest_api.bootcamp.Scheme;
import com.demo.restapi.demo_rest_api.bootcamp.UrlManager;
import com.demo.restapi.demo_rest_api.entity.PostEntity;
import com.demo.restapi.demo_rest_api.model.Post;
import com.demo.restapi.demo_rest_api.model.User;
import com.demo.restapi.demo_rest_api.model.mapper.PostMapper;
import com.demo.restapi.demo_rest_api.model.mapper.UserMapper;
import com.demo.restapi.demo_rest_api.repository.PostRepository;
import com.demo.restapi.demo_rest_api.repository.UserRepository;
import com.demo.restapi.demo_rest_api.service.PostService;

import java.util.Arrays;

@Service
public class PostServiceHolder implements PostService {

  @Value("${api.url.domain}")
  private String domain;

  @Value("${api.url.endpoint2}")
  private String endpoint;

    @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private PostRepository postRepository;

  @Autowired
  private PostMapper postMapper;

  @Override 
  public Post[] getPosts(){

      String url = UrlManager.builder().scheme(Scheme.HTTPS).domain(this.domain)
        .endpoint(this.endpoint).build().toString(); 
    
      Post[] posts = this.restTemplate.getForObject(url, Post[].class); 
      
      if (postRepository.findAll().size() == 0) {
        System.out.println("---- dont have data ----");

        Arrays.asList(posts).stream().forEach(post -> {
          PostEntity postEntity = postMapper.map(post);
          postRepository.save(postEntity);
        });


      } else {
        
        System.out.println("----  already have data  ----");
      }
      // System.err.println(posts.length);
      // System.err.println(Arrays.toString(posts));

      return posts;
    
  }

}
