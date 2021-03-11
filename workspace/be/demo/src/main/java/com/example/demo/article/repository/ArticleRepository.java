package com.example.demo.article.repository;

import com.example.demo.article.domain.Article;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleCustomRepository {

}

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleCustomRepository {

}
