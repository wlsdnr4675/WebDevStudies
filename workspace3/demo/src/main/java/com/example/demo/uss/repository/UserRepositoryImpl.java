package com.example.demo.uss.repository;

import com.example.demo.uss.domain.UserDto;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserCustomRepository {

    @Override
    public UserDto login(String username, String password) {

        return null;
    }

}
