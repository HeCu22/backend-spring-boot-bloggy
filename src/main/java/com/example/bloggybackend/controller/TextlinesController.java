package com.example.bloggybackend.controller;

import com.example.bloggybackend.dto.TextlinesDto;
import com.example.bloggybackend.entity.Textlines;
import com.example.bloggybackend.repository.TextlinesRepository;
import com.example.bloggybackend.service.TextlinesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/bloggy/textlines")
public class TextlinesController {
    private final TextlinesService textlinesService;
    private final TextlinesRepository textlinesRepository;


    public TextlinesController(TextlinesService textlinesService, TextlinesRepository textlinesRepository) {
        this.textlinesService = textlinesService;
        this.textlinesRepository = textlinesRepository;
    }

    @GetMapping("/textlines")
    public ResponseEntity<List<TextlinesDto>> getTextLines(Long id) {

        List<TextlinesDto> dtos = null;
        List<Textlines> tlList = new ArrayList<>();
        tlList = textlinesRepository.findAll();
        dtos = textlinesService.mapTextlinesToDtoList(tlList);
        return ResponseEntity.ok(dtos);
    }
}
