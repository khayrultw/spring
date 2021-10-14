package com.khayrul.articlemanagement.controller;

import com.khayrul.articlemanagement.dto.ArticleRequest;
import com.khayrul.articlemanagement.service.ArticleService;
import com.khayrul.articlemanagement.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getAllArticle(){
        return articleService.getAllArticle();
    }

    @RequestMapping(value = "/article", method = RequestMethod.POST)
    public Article addArticle(@RequestBody ArticleRequest articleRequest){
        return articleService.addArticle(articleRequest);
    }
}
