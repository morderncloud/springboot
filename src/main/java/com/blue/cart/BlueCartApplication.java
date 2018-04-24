package com.blue.cart;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class BlueCartApplication extends SpringBootServletInitializer{


	/**
	 * JAR
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BlueCartApplication.class, args);
	}
	
	/**
	 * WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BlueCartApplication.class);
	}
	
	@PostConstruct
	public void blInit() {
		Set<Productitem> products = new HashSet<>();
		products.add(new Productitem("Roadster", 10));
		products.add(new Productitem("ModelX", 20));
		
		Cart cart = new Cart("BlueCart", products);
		cartDao.save(cart);
	}
	
	
	@Autowired
	private CartDao cartDao;
}
