package com.jinwook.api.address.service;

import com.jinwook.api.address.repository.AddressRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private AddressRepository repo;
}
