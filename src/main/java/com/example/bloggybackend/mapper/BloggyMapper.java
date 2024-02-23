package com.example.bloggybackend.mapper;

import com.example.bloggybackend.dto.BloggyDto;
import com.example.bloggybackend.entity.Bloggy;

public class BloggyMapper {
    public static BloggyDto mapToBloggyDto(Bloggy bloggy) {
        return new BloggyDto(
                bloggy.getId(),
                bloggy.getTitle(),
                bloggy.getSubTitle(),
                bloggy.getContent(),
                bloggy.getDate(),
                bloggy.getAuthor()
        );
    }

    public static Bloggy mapToBloggy(BloggyDto bloggyDto) {
        return new Bloggy(
                bloggyDto.getId(),
                bloggyDto.getTitle(),
                bloggyDto.getSubTitle(),
                bloggyDto.getContent(),
                bloggyDto.getDate(),
                bloggyDto.getAuthor()
        );
    }
}
