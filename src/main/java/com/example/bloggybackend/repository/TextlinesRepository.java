package com.example.bloggybackend.repository;

import com.example.bloggybackend.dto.BloggyDto;
import com.example.bloggybackend.entity.Bloggy;
import com.example.bloggybackend.entity.Textlines;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TextlinesRepository extends JpaRepository <Textlines, Long> {
    List<Textlines> findAllByBloggyIs(BloggyDto bloggyDto);
}
