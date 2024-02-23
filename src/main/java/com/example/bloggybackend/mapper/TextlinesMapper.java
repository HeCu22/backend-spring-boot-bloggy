package com.example.bloggybackend.mapper;

import com.example.bloggybackend.dto.TextlinesDto;
import com.example.bloggybackend.entity.Textlines;

public class TextlinesMapper {
    public static TextlinesDto mapToTextlinesDto(Textlines textlines) {
        TextlinesDto dto = new TextlinesDto();
        dto.setId(textlines.getId());
        dto.setTextline(textlines.getTextline());
        dto.setBloggyDto(BloggyMapper.mapToBloggyDto(textlines.getBloggy()));
        return dto;

    }


    public static Textlines mapToTextlines(TextlinesDto textlinesDto) {
        var textlines = new Textlines();
        textlines.setTextline(textlinesDto.getTextline());
        textlines.setBloggy(BloggyMapper.mapToBloggy(textlinesDto.getBloggyDto()));
        return textlines;
    }

}
