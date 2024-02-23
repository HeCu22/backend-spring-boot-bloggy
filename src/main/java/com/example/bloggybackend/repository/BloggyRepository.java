package com.example.bloggybackend.repository;

import com.example.bloggybackend.entity.Bloggy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloggyRepository extends JpaRepository<Bloggy, Long> {
}
