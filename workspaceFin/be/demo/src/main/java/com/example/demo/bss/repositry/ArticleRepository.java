package com.example.demo.bss.repositry;

import com.example.demo.bss.domain.Article;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleCustomRepository {

}

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleCustomRepository {

}
