package com.example.bloggybackend.dto;

import com.example.bloggybackend.dto.BloggyDto;

public class TextlinesDto {
    public Long id;
    public String textline;

    private BloggyDto bloggyDto;

    public TextlinesDto(Long id, String textline) {
        this.id = id;
        this.textline = textline;

    }

    public TextlinesDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextline() {
        return textline;
    }

    public void setTextline(String textline) {
        this.textline = textline;
    }

    public BloggyDto getBloggyDto() {
        return bloggyDto;
    }

    public void setBloggyDto(BloggyDto bloggyDto) {
        this.bloggyDto = bloggyDto;
    }
}
