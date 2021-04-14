package com.jinwook.api.address.repository;

import com.jinwook.api.address.domain.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
