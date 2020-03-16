package com.ac.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.curso.entities.Product;


public interface ProductRespository extends JpaRepository<Product, Long>{
	
	
}
