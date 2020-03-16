package com.ac.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.curso.entities.Product;
import com.ac.curso.respositories.ProductRespository;

@Service
public class ProductService {
	@Autowired
	private ProductRespository userRespository;
	
	public List<Product> findAll (){
		return userRespository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = userRespository.findById(id);
		return obj.get();
	}
}
