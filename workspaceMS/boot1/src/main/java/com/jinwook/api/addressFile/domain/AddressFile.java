package com.jinwook.api.addressFile.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "address_files")
public class AddressFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "file_no")
    private long fileNo;
    @Column(name = "ofname")
    private String ofname;
    @Column(name = "sfname")
    private String sfname;
    @Column(name = "fsize")
    private long fsize;

    // @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // @JoinColumn(name = "seq")
    // private Address Address;

}
