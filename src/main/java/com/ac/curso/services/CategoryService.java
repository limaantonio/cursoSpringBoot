package com.ac.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.curso.entities.Category;
import com.ac.curso.respositories.CategoryRespository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRespository userRespository;
	
	public List<Category> findAll (){
		return userRespository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = userRespository.findById(id);
		return obj.get();
	}
}
