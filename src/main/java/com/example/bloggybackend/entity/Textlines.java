package com.example.bloggybackend.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "bloglines")
public class Textlines {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String textline;

    @ManyToOne
    @JoinColumn(name = "bloggy_id")
    public Bloggy bloggy;

    public Textlines(Long id, String textline, Bloggy bloggy) {
        this.id = id;
        this.textline = textline;
        this.bloggy = bloggy;
    }

    public Textlines() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTextline() {
        return textline;
    }

    public void setTextline(String textline) {
        this.textline = textline;
    }

    public Bloggy getBloggy() {
        return bloggy;
    }

    public void setBloggy(Bloggy bloggy) {
        this.bloggy = bloggy;
    }
}

