package com.assignment.Assignment3;

import com.assignment.Assignment3.entity.Barang;
import com.assignment.Assignment3.repository.BarangRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment3Application {
	public static void main(String[] args) {
		SpringApplication.run(Assignment3Application.class, args);
	}
}
