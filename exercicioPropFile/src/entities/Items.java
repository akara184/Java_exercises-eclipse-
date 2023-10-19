package entities;

public class Items {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Items(String name, double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Items() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getquantity() {
		return quantity;
	}
	public void setquantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double productPrice() {
		return quantity * price;
		
	}
	
}
