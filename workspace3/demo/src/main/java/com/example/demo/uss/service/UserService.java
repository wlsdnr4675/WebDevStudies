package com.example.demo.uss.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    public UserDto login(String username, String password);
}
