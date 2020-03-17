package com.ac.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ac.curso.entities.Category;
import com.ac.curso.entities.Order;
import com.ac.curso.entities.Payment;
import com.ac.curso.entities.Product;
import com.ac.curso.entities.User;
import com.ac.curso.entities.enums.OrderStatus;
import com.ac.curso.respositories.CategoryRespository;
import com.ac.curso.respositories.OrderRespository;
import com.ac.curso.respositories.ProductRespository;
import com.ac.curso.respositories.UserRespository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRespository userRespository;

	@Autowired
	private OrderRespository orderRepository;

	@Autowired
	private CategoryRespository categoryRepository;

	@Autowired
	private ProductRespository productRespository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		
		Product p1 = new Product(null,"The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "SmartTv", "Lorem ipsum dolor sit amet, consectetur.", 80.5, "");
		Product p3 = new Product(null,"Notebook", "Lorem ipsum dolor sit amet, consectetur.", 1000.5, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRespository.saveAll(Arrays.asList(p1, p2, p3));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		
		productRespository.saveAll(Arrays.asList(p1, p2, p3));
		
		User u1 = new User( null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User( null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAY, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELAD, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		
		userRespository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2,o3));
		
		Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		o1.setPayment(pay1);
		
		orderRepository.save(o1);
		
		
		
		
		
		
	}

}
