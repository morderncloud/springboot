package com.example.demo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Cart;
import domain.Product;

@RestController
public class BlueController {
	
	private Cart cart;
	
	@PostConstruct
	public void init() {
		Set<Product> products = new HashSet<>();
		products.add(new Product("Roadster", 10));
		products.add(new Product("ModelX", 20));
		
		cart = new Cart("Blue Cart", 1, products);
	}
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map<String,String> model, @PathVariable String name){
		model.put("name", name);
		return "hello";
	}
	
	@RequestMapping("/cart")
	public Cart listCart() {
		return cart;
	}

}
