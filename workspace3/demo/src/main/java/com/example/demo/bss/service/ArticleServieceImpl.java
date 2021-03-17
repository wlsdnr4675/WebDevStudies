package com.example.demo.bss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bss.domain.Article;
import com.example.demo.bss.repositry.ArticleRepository;
import com.example.demo.cmm.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;

public class ArticleServieceImpl extends AbstractService<Article> {

    @Autowired
    ArticleRepository repo;

    @Override
    public Optional<Article> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Article> findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Article> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Article> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Article save(Article entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Article getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
