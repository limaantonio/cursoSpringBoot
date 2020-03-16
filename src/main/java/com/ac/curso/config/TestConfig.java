package com.ac.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ac.curso.entities.User;
import com.ac.curso.respositories.UserRespository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRespository userRespository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User( null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User( null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRespository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
