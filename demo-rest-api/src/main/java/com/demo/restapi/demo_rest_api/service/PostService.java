package com.demo.restapi.demo_rest_api.service;

import java.util.List;
import com.demo.restapi.demo_rest_api.entity.PostEntity;
import com.demo.restapi.demo_rest_api.model.Post;
import com.demo.restapi.demo_rest_api.model.PostDTO;

public interface PostService {

  public Post[] getPosts();

  public Post getPostById(Long id);

  public List<PostDTO> getPostsByUserId(Long userId, Long postId);

  public PostEntity createNewPost(Long userId, String title, String body);
}
