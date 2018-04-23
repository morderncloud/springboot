package com.blue.cart;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CartDao extends CrudRepository<Cart, Long>{
	
	List<Cart> findAll();
	Cart findByName(String name);
	
}
