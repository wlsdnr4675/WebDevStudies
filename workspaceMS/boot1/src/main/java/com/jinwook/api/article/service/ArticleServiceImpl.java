package com.jinwook.api.article.service;

import com.jinwook.api.article.repository.ArticleRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private ArticleRepository repo;
}
