package com.ac.curso.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.curso.entities.User;
import com.ac.curso.respositories.UserRespository;

@Service
public class UserService {
	@Autowired
	private UserRespository userRespository;
	
	public List<User> findAll (){
		return userRespository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRespository.findById(id);
		return obj.get();
	}
}