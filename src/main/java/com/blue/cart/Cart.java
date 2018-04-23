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
	private Set<Productitem> productitems;
	
	public Set<Productitem> getProductitems() {
		return productitems;
	}

	public void setProductitems(Set<Productitem> productitems) {
		this.productitems = productitems;
	}

	private String name;
	
	@Id @GeneratedValue
	private Long id;
	
	

	public Cart() {
		super();
	}
	
	public Cart(String name, Set<Productitem> products) {
		this();
		this.name = name;
		//this.id = id;
		this.setProductitems(products);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





}
