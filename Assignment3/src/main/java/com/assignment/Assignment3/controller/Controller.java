package com.assignment.Assignment3.controller;

import com.assignment.Assignment3.entity.Barang;
import com.assignment.Assignment3.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/products")
public class Controller {
    @Autowired
    BarangService barangService;
    @GetMapping("")
    public List<Barang> list(){
        return barangService.listAllBarang();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barang> get(@PathVariable Integer id){
        try{
            Barang barang = barangService.getBarang(id);
            return new ResponseEntity<Barang>(barang, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<Barang>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Barang barang){
        barangService.saveBarang(barang);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Barang barang,
                                    @PathVariable Integer id){
        try{
            Barang existBarang = barangService.getBarang(id);
            barang.setId(Long.valueOf(id));
            barangService.saveBarang(barang);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        barangService.deleteBarang(id);
    }
}