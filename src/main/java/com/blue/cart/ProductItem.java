package com.blue.cart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	private int amt;
	
	public Product() {
		super();
		
	}
	
	public Product(String name, int amt) {
		this();
		this.name = name;
		this.amt = amt;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
}
