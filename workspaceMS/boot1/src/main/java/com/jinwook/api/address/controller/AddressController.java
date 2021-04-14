package com.jinwook.api.address.controller;

import com.jinwook.api.address.service.AddressServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class AddressController {
    private AddressServiceImpl service;
}
