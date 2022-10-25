package com.biodata.siswa.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biodata.siswa.entity.Siswa;
import com.biodata.siswa.repository.SiswaRepository;

@Service
@Transactional
public class SiswaService {

    @Autowired
    private SiswaRepository siswaRepository;

    public Iterable<Siswa> findAll() {
        return siswaRepository.findAll();
    }

}
