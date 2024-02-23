package com.example.bloggybackend.service;

import com.example.bloggybackend.dto.BloggyDto;
import com.example.bloggybackend.dto.TextlinesDto;
import com.example.bloggybackend.entity.Bloggy;
import com.example.bloggybackend.entity.Textlines;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TextlinesService {
    BloggyDto getBloggyById(Long bloggyId);

    TextlinesDto addTextline(TextlinesDto textlinesDto);

    List<TextlinesDto> mapTextlinesToDtoList(List<Textlines> textlines);

    TextlinesDto getTextline(Long bloggyId);


    List<TextlinesDto> getAllTextlinesByBlogPost(BloggyDto bloggyDto);

    List<TextlinesDto> getAllTextlines();
}
