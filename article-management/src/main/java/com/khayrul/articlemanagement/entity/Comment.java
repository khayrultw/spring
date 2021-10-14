package com.khayrul.articlemanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String body;
    @Column(nullable = false)
    private String date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "article_id")
    @JsonIgnore
    private Article article;

    public Comment(){

    }

    public Comment(Integer id, String body, String date) {
        this.id = id;
        this.body = body;
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public Article getArticle() {
        return article;
    }
}
