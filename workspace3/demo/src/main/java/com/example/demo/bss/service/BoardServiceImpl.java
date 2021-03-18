package com.example.demo.bss.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.bss.domain.Board;
import com.example.demo.bss.repositry.BoardRepositoryImpl;
import com.example.demo.cmm.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl extends AbstractService<Board> {

    @Autowired
    BoardRepositoryImpl repo;

    @Override
    public Optional<Board> findOne() {
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
    public Optional<Board> findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Board> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Board> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Board save(Board entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Board getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
