package com.example.bloggybackend.service.impl;

import com.example.bloggybackend.dto.BloggyDto;
import com.example.bloggybackend.entity.Bloggy;
import com.example.bloggybackend.exception.ResourceNotFoundException;
import com.example.bloggybackend.mapper.BloggyMapper;
import com.example.bloggybackend.repository.BloggyRepository;
import com.example.bloggybackend.service.BloggyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BloggyServiceImpl implements BloggyService {
    private BloggyRepository bloggyRepository;

    public BloggyServiceImpl(BloggyRepository bloggyRepository) {
        this.bloggyRepository = bloggyRepository;
    }


    public BloggyRepository getBloggyRepository() {
        return bloggyRepository;
    }

    public void setBloggyRepository(BloggyRepository bloggyRepository) {
        this.bloggyRepository = bloggyRepository;}




    @Override
    public BloggyDto createBloggy(BloggyDto bloggyDto) {

        Bloggy bloggy = BloggyMapper.mapToBloggy(bloggyDto);
        Bloggy savedBloggy = bloggyRepository.save(bloggy);
        return BloggyMapper.mapToBloggyDto(savedBloggy);
    }

    @Override
    public BloggyDto getBloggyById(Long bloggyId) {
        Bloggy bloggy = bloggyRepository.findById(bloggyId).orElseThrow(() -> new ResourceNotFoundException("Blog does not exist for this id:" + bloggyId));
        return BloggyMapper.mapToBloggyDto(bloggy);
    }

    @Override
    public List<BloggyDto> getAllBloggies() {
        List<Bloggy> blogItems = bloggyRepository.findAll();
        return blogItems.stream().map((bloggy) -> BloggyMapper.mapToBloggyDto(bloggy)).collect(Collectors.toList());
    }

    @Override
    public BloggyDto updateBloggy(Long bloggyId, BloggyDto updateBloggy) {

        Bloggy bloggy = bloggyRepository.findById(bloggyId).orElseThrow(() -> new ResourceNotFoundException("Blog item does not exist with id:" + bloggyId));
        bloggy.setTitle(updateBloggy.getTitle());
        bloggy.setSubTitle(updateBloggy.getSubTitle());
        bloggy.setAuthor(updateBloggy.getAuthor());
        bloggy.setContent(updateBloggy.getContent());
        bloggy.setDate(updateBloggy.getDate());
        Bloggy updateBloggyObj = bloggyRepository.save(bloggy);
        return BloggyMapper.mapToBloggyDto(updateBloggyObj);
    }

    @Override
    public void deleteBloggy(Long bloggyId) {
        Bloggy bloggy = bloggyRepository.findById(bloggyId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Blog item does not exist with this id:" + bloggyId));
        bloggyRepository.deleteById(bloggyId);

    }



}
