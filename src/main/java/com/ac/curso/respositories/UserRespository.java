package com.ac.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.curso.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
