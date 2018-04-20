package domain;

public class Product {

	private String name;
	private int amt;
	
	public Product() {
		
	}
	
	public Product(String name, int amt) {
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
