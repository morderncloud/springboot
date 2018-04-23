package com.blue.cart;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Cart {
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cartId")
	private Set<Product> products;
	
	private String name;
	
	@Id @GeneratedValue
	private Long id;
	
	

	public Cart() {
		super();
	}
	
	public Cart(String name, Set<Product> products) {
		this();
		this.name = name;
		//this.id = id;
		this.setProducts(products);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
