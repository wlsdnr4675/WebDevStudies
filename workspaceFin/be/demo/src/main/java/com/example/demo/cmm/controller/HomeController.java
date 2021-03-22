package com.example.demo.cmm.controller;

import com.example.demo.util.proxy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@RequiredArgsConstructor
@RestController
public class HomeController {

    @GetMapping("/")
    public String init() {
        System.out.println("getInit()");
        System.out.println("========================");
        System.out.println("=== Boot Initialized ===");
        System.out.println("========================");

        return "Hello React";
    }
}
