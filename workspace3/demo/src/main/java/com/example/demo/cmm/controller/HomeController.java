package com.example.demo.cmm.controller;

import com.example.demo.util.proxy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@RequiredArgsConstructor
@RestController("/")
public class HomeController extends proxy {

    @GetMapping("/init")
    public String init() {
        print.accept("getInit()");
        print.accept("========================");
        print.accept("=== Boot Initialized ===");
        print.accept("========================");

        return "Hello React";
    }
}
