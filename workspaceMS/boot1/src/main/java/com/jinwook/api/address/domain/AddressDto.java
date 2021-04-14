package com.jinwook.api.address.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AddressDto {
    private long addressNo;
    private String name;
    private String addr;
    private Date rdate;
}
