package com.kaiserwebdevelopment.webapi.repository;

import com.kaiserwebdevelopment.webapi.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
