package com.khayrul.articlemanagement.service;

import com.khayrul.articlemanagement.dto.CommentRequest;
import com.khayrul.articlemanagement.entity.Article;
import com.khayrul.articlemanagement.entity.Comment;
import com.khayrul.articlemanagement.entity.User;
import com.khayrul.articlemanagement.repository.ArticleRepository;
import com.khayrul.articlemanagement.repository.CommentRepository;
import com.khayrul.articlemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public Comment addComment(CommentRequest commentRequest){
        User user = userRepository.findUserById(commentRequest.getUserId());
        Article article = articleRepository.findArticleById(commentRequest.getArticleId());

        Comment comment = commentRequest.getComment();

        user.getComments().add(comment);
        article.getComments().add(comment);

        comment.setUser(user);
        comment.setArticle(article);

        userRepository.save(user);
        articleRepository.save(article);

        return comment;
    }

    public List<Comment> getComments(){
        return (List<Comment>)commentRepository.findAll();
    }
}
