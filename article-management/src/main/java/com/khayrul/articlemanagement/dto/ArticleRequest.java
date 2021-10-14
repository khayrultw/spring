package com.khayrul.articlemanagement.dto;

import com.khayrul.articlemanagement.entity.Article;

public class ArticleRequest {
    private Integer userId;
    private Article article;

    public ArticleRequest() {

    }

    public ArticleRequest(Integer userId, Article article) {
        this.userId = userId;
        this.article = article;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getUserId() {
        return userId;
    }

    public Article getArticle() {
        return article;
    }

    @Override
    public String toString() {
        return "ArticleRequest{" +
                "userId=" + userId +
                ", article=" + article +
                '}';
    }
}
