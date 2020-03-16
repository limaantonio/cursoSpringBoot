package com.ac.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.curso.entities.Order;


public interface OrderRespository extends JpaRepository<Order, Long>{

}
