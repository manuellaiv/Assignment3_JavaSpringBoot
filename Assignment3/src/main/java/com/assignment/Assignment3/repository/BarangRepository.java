package com.assignment.Assignment3.repository;

import com.assignment.Assignment3.entity.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarangRepository extends JpaRepository<Barang, Long> {
}