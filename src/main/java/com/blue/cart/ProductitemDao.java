package com.blue.cart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="productitems", rel="productitems")
public interface ProductitemDao extends CrudRepository<Productitem, Long>{
	

	
}
