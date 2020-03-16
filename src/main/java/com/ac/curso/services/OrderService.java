package com.ac.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.curso.entities.Order;
import com.ac.curso.respositories.OrderRespository;

@Service
public class OrderService {
	@Autowired
	private OrderRespository userRespository;
	
	public List<Order> findAll (){
		return userRespository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = userRespository.findById(id);
		return obj.get();
	}
}
