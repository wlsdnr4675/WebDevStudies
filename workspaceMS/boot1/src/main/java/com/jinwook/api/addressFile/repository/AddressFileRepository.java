package com.jinwook.api.addressFile.repository;

import com.jinwook.api.addressFile.domain.AddressFile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressFileRepository extends JpaRepository<AddressFile, Long> {

}
