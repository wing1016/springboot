package com.demo.restapi.demo_rest_api.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.demo.restapi.demo_rest_api.bootcamp.Scheme;
import com.demo.restapi.demo_rest_api.bootcamp.UrlManager;
import com.demo.restapi.demo_rest_api.entity.PostEntity;
import com.demo.restapi.demo_rest_api.model.Post;
import com.demo.restapi.demo_rest_api.model.PostDTO;
import com.demo.restapi.demo_rest_api.model.mapper.PostMapper;
import com.demo.restapi.demo_rest_api.repository.PostRepository;
import com.demo.restapi.demo_rest_api.service.PostService;

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
  public List<PostDTO> getPostsByUserId(Long userId, Long postId) {

    String url = UrlManager.builder().scheme(Scheme.HTTPS).domain(this.domain)
        .endpoint(this.endpoint).build().toString();
    PostDTO[] postDTO = this.restTemplate.getForObject(url, PostDTO[].class);

    // System.out.println(Arrays.toString(postDTO));
    // Post[] p = new Post[] {};
    List<PostDTO> postList = new ArrayList<>();

    if (postId == 0) {
      for (PostDTO pDto : postDTO) {
        if (pDto.getUserId() == userId) {
          postList.add(pDto);
        }
      }
    } else {
      for (PostDTO pDto : postDTO) {
        if (pDto.getId() == postId && pDto.getUserId() == userId) {
          postList.add(pDto);
        }
      }
    }
    return postList;
  }


  @Override
  public Post getPostById(Long id) {
    String url = UrlManager.builder().scheme(Scheme.HTTPS).domain(this.domain)
        .endpoint(this.endpoint).build().toString();

    Post[] posts = this.restTemplate.getForObject(url, Post[].class);
    Post p = new Post();
    for (Post post : posts) {
      if (post.getId() == id) {
        p = post;
      }
    }
    return p;
  };

  @Override
  public Post[] getPosts() {
    String url = UrlManager.builder().scheme(Scheme.HTTPS).domain(this.domain)
        .endpoint(this.endpoint).build().toString();

    Post[] posts = this.restTemplate.getForObject(url, Post[].class);

    if (postRepository.findAll().size() == 0) {

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

  @Override
  public PostEntity createNewPost(Long userId, String title, String body) {
    System.err.println( "userId Service" + userId);
    return postRepository.save(PostEntity.builder() //
        .userId(userId) //
        .title(title) //
        .body(body).build());
  }
}
