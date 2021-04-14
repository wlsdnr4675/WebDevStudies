package com.jinwook.api.address.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressNo")
    private long addressNo;
    @Column(name = "name")
    private String name;
    @Column(name = "addr")
    private String addr;
    @Column(name = "rdate")
    private Date rdate;
}
