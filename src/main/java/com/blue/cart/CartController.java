package com.blue.cart;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	
	@Autowired
	private CartDao cartDao;
	
	
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map<String,String> model, @PathVariable String name){
		model.put("name", name);
		return "hello";
	}
	
	@RequestMapping("/cart")
	public Cart listCart() {
		Set<Productitem> products = new HashSet<>();
		products.add(new Productitem("BMW 730", 10));
		products.add(new Productitem("Benz", 20));
		
		Cart cart = new Cart("RedCart", products);
		
		return cart;
	}
	
	@RequestMapping("/carts/{name}")
	public Cart getCart(@PathVariable String name) {
		return cartDao.findByName(name);
	}
	
	@RequestMapping("/cartsall")
	public List<Cart> getCartAll() {
		return cartDao.findAll();
	}

}
