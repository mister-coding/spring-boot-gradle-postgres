package com.biodata.siswa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@Entity() @Data()
@Table(name = "siswa")
public class Siswa extends BaseEntity{

    private String name;
    
}
