package entities;

public class Product {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name + ", $ " +  String.format("%.2f", price) + ", " + quantity + " units. " 
				+ "Total: $ " + String.format("%.2f", totalValueStock()) + ".";
	}
	
}
