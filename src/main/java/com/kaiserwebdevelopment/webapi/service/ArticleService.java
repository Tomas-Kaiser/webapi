package com.kaiserwebdevelopment.webapi.service;

import com.kaiserwebdevelopment.webapi.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();

    Article saveArticle(Article article);
}
