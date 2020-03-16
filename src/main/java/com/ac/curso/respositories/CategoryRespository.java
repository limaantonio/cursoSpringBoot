package com.ac.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.curso.entities.Category;


public interface CategoryRespository extends JpaRepository<Category, Long>{
	
	
}
