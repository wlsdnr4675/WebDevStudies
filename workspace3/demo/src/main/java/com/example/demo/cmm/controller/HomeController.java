package com.example.demo.cmm.controller;

import com.example.demo.util.proxy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
@RestController("/")
@CrossOrigin(origins = "http://localhost:3000/", allowedHeaders = "*")
public class HomeController extends proxy {

    @GetMapping("/")
    public String init() {
        log.info("getInit()");
        print.accept("========================");
        print.accept("=== Boot Initialized ===");
        print.accept("========================");

        return "Hello React";
    }
}
