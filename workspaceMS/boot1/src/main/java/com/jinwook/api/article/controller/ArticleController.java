package com.jinwook.api.article.controller;

import com.jinwook.api.article.service.ArticleServiceImpl;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private ArticleServiceImpl service;
}
