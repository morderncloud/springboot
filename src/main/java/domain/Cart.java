package domain;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cart {
	
	private Set<Product> products;
	
	private String name;
	private int id;
	
	public Cart() {
		
	}
	
	public Cart(String name, int id, Set<Product> products) {
		this.name = name;
		this.id = id;
		this.setProducts(products);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
