package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.service.UserService;
import com.example.demo.util.proxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RequestMapping("/auth")
public class AuthController extends proxy {
    // for Test
    @GetMapping("/insertMany")
    public String insertMany() {
        print.accept("--------진입---------");
        return "100";
    }

    // CREATE에 해당, 포스트에는 보안의 사용 있음
    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody UserDto user) {
        Map<String, Object> map = new HashMap<>();
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
