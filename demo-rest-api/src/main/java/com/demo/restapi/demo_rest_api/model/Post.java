package com.demo.restapi.demo_rest_api.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter // setter not used here but i also add.
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

    private Long id;
    private Long userId;
    private String title;
    private String body;
  
}


// [
// {
// "userId": 1,
// "id": 1,
// "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
// "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
// },
// ]