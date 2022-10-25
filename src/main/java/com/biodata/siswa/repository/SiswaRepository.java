package com.biodata.siswa.repository;

import org.springframework.data.repository.CrudRepository;

import com.biodata.siswa.entity.Siswa;

public interface SiswaRepository extends CrudRepository<Siswa, Long> {
    
}
