package com.ac.curso.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.curso.entities.User;
import com.ac.curso.respositories.UserRespository;
import com.ac.curso.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRespository userRespository;
	
	public List<User> findAll (){
		return userRespository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRespository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return userRespository.save(obj);
	}
	
	public void delete(Long id) {
		userRespository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = userRespository.getOne(id);
		updateData(entity, obj);
		return userRespository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
