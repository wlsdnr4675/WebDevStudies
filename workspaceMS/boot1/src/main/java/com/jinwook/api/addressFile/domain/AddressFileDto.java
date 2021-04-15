package com.jinwook.api.addressFile.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AddressFileDto {

    private long fileNo;

    private String ofname;

    private String sfname;

    private long fsize;

}
