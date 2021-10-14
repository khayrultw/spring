package com.khayrul.articlemanagement.service;

import com.khayrul.articlemanagement.dto.ArticleRequest;
import com.khayrul.articlemanagement.entity.User;
import com.khayrul.articlemanagement.repository.ArticleRepository;
import com.khayrul.articlemanagement.entity.Article;
import com.khayrul.articlemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Article> getAllArticle() {
        return (List<Article>)articleRepository.findAll();
    }

    public Article addArticle(ArticleRequest articleRequest) {
        User user = userRepository.findUserById(articleRequest.getUserId());
        Article article = articleRequest.getArticle();
        user.getArticles().add(article);
        article.setUser(user);

        System.out.println(user.getArticles().size());
        userRepository.save(user);
        return articleRequest.getArticle();
    }
}
