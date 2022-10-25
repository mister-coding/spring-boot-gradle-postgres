package com.biodata.siswa.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;


import lombok.Getter;
import lombok.Setter;

@MappedSuperclass @Getter @Setter
public class BaseEntity{

    @Id()
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    
}
