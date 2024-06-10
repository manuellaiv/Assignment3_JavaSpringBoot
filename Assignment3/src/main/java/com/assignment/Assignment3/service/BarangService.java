package com.assignment.Assignment3.service;

import com.assignment.Assignment3.entity.Barang;
import com.assignment.Assignment3.repository.BarangRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BarangService {
    @Autowired
    private BarangRepository barangRepository;
    public List<Barang> listAllBarang(){
        return barangRepository.findAll();
    }

    public void saveBarang(Barang barang){
        barangRepository.save(barang);
    }

    public Barang getBarang(Integer id){
        return barangRepository.findById(Long.valueOf(id)).get();
    }

    public void deleteBarang(Integer id){
        barangRepository.deleteById(Long.valueOf(id));
    }
}
