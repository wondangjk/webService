package com.fashion.springboot.web.dto;


import com.fashion.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts Entity){
        this.id = Entity.getId();
        this.title = Entity.getTitle();
        this.author = Entity.getAuthor();
        this.content = Entity.getContent();
    }
}
