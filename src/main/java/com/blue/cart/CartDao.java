package com.blue.cart;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="cartlist", rel="cartlist")
public interface CartDao extends CrudRepository<Cart, Long>{
	
	List<Cart> findAll();
	Cart findByName(String name);
	
}
