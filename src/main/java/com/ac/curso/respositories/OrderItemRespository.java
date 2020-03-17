package com.ac.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.curso.entities.OrderItem;


public interface OrderItemRespository extends JpaRepository<OrderItem, Long>{
	
	
}
