package com.example.demo.uss.repository;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserCustomRepository {

    public UserDto login(String username, String password);
}

public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {
    public UserDto findByUsername(String username);

}
