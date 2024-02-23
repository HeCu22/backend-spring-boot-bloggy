package com.example.bloggybackend.dto;

public class BloggyDto {
    private Long id;

    private String title;

    private String subTitle;

    private String content;

    private String date;

    private String author;

    public BloggyDto(Long id, String title, String subTitle, String content, String date, String author) {

        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.date = date;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
