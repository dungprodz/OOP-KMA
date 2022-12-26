package kma.oop;

import java.io.Serializable;

public class HangHoa implements Serializable {
	private String name;
	private int amount;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public HangHoa(String name, int amount, double price) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
	}
	public HangHoa() {
		super();
	}
	
}
