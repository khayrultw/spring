package com.khayrul.articlemanagement.repository;

import com.khayrul.articlemanagement.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
    public Article findArticleById(Integer id);
}
