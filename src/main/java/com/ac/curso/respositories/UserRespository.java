package com.ac.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ac.curso.entities.User;


public interface UserRespository extends JpaRepository<User, Long>{

}
