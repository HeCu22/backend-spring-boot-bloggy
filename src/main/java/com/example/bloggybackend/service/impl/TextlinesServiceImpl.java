package com.example.bloggybackend.service.impl;

import com.example.bloggybackend.dto.BloggyDto;
import com.example.bloggybackend.dto.TextlinesDto;
import com.example.bloggybackend.entity.Bloggy;
import com.example.bloggybackend.entity.Textlines;
import com.example.bloggybackend.mapper.TextlinesMapper;
import com.example.bloggybackend.repository.BloggyRepository;
import com.example.bloggybackend.repository.TextlinesRepository;
import com.example.bloggybackend.service.BloggyService;
import com.example.bloggybackend.service.TextlinesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextlinesServiceImpl implements TextlinesService {

    private TextlinesRepository textlinesRepository;

    private BloggyRepository bloggyRepository;

    private BloggyService bloggyService;

    public TextlinesServiceImpl(TextlinesRepository textlinesRepository, BloggyRepository bloggyRepository, BloggyService bloggyService) {
        this.textlinesRepository = textlinesRepository;
        this.bloggyRepository = bloggyRepository;
        this.bloggyService = bloggyService;
    }

    public TextlinesRepository getTextlinesRepository() {
        return textlinesRepository;
    }

    public void setTextlinesRepository(TextlinesRepository textlinesRepository) {
        this.textlinesRepository = textlinesRepository;
    }

    public BloggyRepository getBloggyRepository() {
        return bloggyRepository;
    }

    public void setBloggyRepository(BloggyRepository bloggyRepository) {
        this.bloggyRepository = bloggyRepository;
    }

    public BloggyService getBloggyService() {
        return bloggyService;
    }

    public void setBloggyService(BloggyService bloggyService) {
        this.bloggyService = bloggyService;
    }

    @Override
    public BloggyDto getBloggyById(Long bloggyId) {
        return null;
    }

    @Override
    public TextlinesDto addTextline(TextlinesDto textlinesDto) {
        Textlines textlines = TextlinesMapper.mapToTextlines(textlinesDto);
        Textlines saveTextlines = textlinesRepository.save(textlines);
        return TextlinesMapper.mapToTextlinesDto(saveTextlines);
    }

    @Override
    public List<TextlinesDto> mapTextlinesToDtoList(List<Textlines> textlines) {
        return null;
    }

    @Override
    public TextlinesDto getTextline(Long bloggyId) {
        return null;
    }


    @Override
    public List<TextlinesDto> getAllTextlinesByBlogPost(BloggyDto bloggyDto) {
        List<Textlines> textlinesList = textlinesRepository.findAllByBloggyIs(bloggyDto);
        return mapTextlinesToDtoList(textlinesList);
    }

    @Override
    public List<TextlinesDto> getAllTextlines() {
        List<Textlines> tlList = textlinesRepository.findAll();
        return mapTextlinesToDtoList(tlList);
    }


}
