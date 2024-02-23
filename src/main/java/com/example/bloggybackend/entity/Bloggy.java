package com.example.bloggybackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "blog_items")
public class Bloggy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "a_title")
    private String title;

    @Column(name="b_sub_title")
    private String subTitle;

    @Column(name="c_content", columnDefinition = "TEXT")
    private String content;

    @Column(name="d_date_created")
    private String date;

    @Column(name="e_author")
    private String author;

    @OneToMany(mappedBy = "bloggy")
    @JsonIgnore
    private List<Textlines> textlines;

    public Bloggy(Long id, String title, String subTitle, String content, String date, String author) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.date = date;
        this.author = author;
    }

    public Bloggy() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
