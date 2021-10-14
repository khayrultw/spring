package com.khayrul.articlemanagement.dto;

import com.khayrul.articlemanagement.entity.Comment;

public class CommentRequest {
    private Integer articleId;
    private Integer userId;
    private Comment comment;

    public CommentRequest() {

    }

    public CommentRequest(Integer articleId, Integer userId, Comment comment) {
        this.articleId = articleId;
        this.userId = userId;
        this.comment = comment;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Comment getComment() {
        return comment;
    }
}
