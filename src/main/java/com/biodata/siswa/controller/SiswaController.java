package com.biodata.siswa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biodata.siswa.entity.Siswa;
import com.biodata.siswa.services.SiswaService;

@RestController
@RequestMapping("/api/siswa")
public class SiswaController {

    @Autowired
    private SiswaService siswaService;

    @GetMapping()
    public Iterable<Siswa> findAll(){
        return siswaService.findAll();
    }
    
}
