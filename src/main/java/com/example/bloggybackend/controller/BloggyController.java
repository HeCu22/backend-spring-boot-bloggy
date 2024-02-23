package com.example.bloggybackend.controller;

import com.example.bloggybackend.dto.BloggyDto;
import com.example.bloggybackend.service.BloggyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/bloggy")
public class BloggyController {

    private BloggyService bloggyService;


    public BloggyController(BloggyService bloggyService) {
        this.bloggyService = bloggyService;
    }

    @PostMapping
    public ResponseEntity<BloggyDto> createBloggy(@RequestBody BloggyDto bloggyDto) {
       BloggyDto saveBloggy = bloggyService.createBloggy(bloggyDto);
       return new ResponseEntity<>(saveBloggy, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<BloggyDto> getBloggyByOd(@PathVariable("id") Long BloggyId) {
        BloggyDto bloggyDto = bloggyService.getBloggyById(BloggyId);
        return ResponseEntity.ok(bloggyDto);
    }

    @GetMapping
    public ResponseEntity<List<BloggyDto>> getAllBlogItems() {
        List<BloggyDto> BlogItems = bloggyService.getAllBloggies();
        return ResponseEntity.ok(BlogItems);
    }

    @PutMapping("{id}")
    public ResponseEntity<BloggyDto> updateBloggy(@PathVariable("id") Long BloggyId,
                                                   @RequestBody BloggyDto updateBloggy) {
        BloggyDto bloggyDto = bloggyService.updateBloggy(BloggyId, updateBloggy);
        return ResponseEntity.ok(bloggyDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBloggy(@PathVariable("id") Long BloggyId) {
        bloggyService.deleteBloggy(BloggyId);
        return ResponseEntity.ok("Blog item deleted successfully");

    }


}
