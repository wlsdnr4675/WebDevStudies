package com.example.demo.uss.repository;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface UserCustomRepository {

}

public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {

}
