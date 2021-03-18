package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.uss.domain.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping(value = "/login")
    public void login(@RequestBody UserDto user) {
        Map<String, Object> map = new HashMap<>();

    }

}
