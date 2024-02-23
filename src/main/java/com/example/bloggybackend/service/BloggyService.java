package com.example.bloggybackend.service;

import com.example.bloggybackend.dto.BloggyDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BloggyService {
    BloggyDto createBloggy(BloggyDto bloggyDto);

    BloggyDto getBloggyById(Long bloggyId);

    List<BloggyDto> getAllBloggies();

    BloggyDto updateBloggy(Long bloggyId, BloggyDto updateBloggy);

    void deleteBloggy(Long bloggyId);


}

