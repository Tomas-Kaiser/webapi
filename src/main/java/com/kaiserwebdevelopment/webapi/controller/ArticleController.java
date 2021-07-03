package com.kaiserwebdevelopment.webapi.controller;

import com.kaiserwebdevelopment.webapi.entity.Article;
import com.kaiserwebdevelopment.webapi.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0")
public class ArticleController {

    @Autowired
    private ArticleServiceImpl articleService;

    @GetMapping("/articles")
    private List<Article> getAllArticles(){
        return articleService.getAllArticles();
    }

    @PostMapping("/articles")
    public Article saveArticle(@Valid @RequestBody Article article) {
        return articleService.saveArticle(article);
    }
}
