package com.example.demo.bbs.repository;

import com.example.demo.bbs.domain.Article;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleCustomRepository {

}

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleCustomRepository {

}
