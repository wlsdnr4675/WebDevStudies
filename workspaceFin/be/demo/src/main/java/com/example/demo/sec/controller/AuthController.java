package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class AuthController {
    // for Test
    @GetMapping("/insertMany")
    public Map<String, Object> insertMany() {
        System.out.println("insertMany 들어옴");
        Map<String, Object> map = new HashMap<>();
        map.put("data", "SUCCESS");
        return map;
    }

    // // CREATE에 해당, 포스트에는 보안의 사용 있음
    // @PostMapping(value = "/login")
    // public ResponseEntity<?> login(@RequestBody UserDto user) {
    // Map<String, Object> map = new HashMap<>();
    // return new ResponseEntity<>(map, HttpStatus.OK);
    // }

}
