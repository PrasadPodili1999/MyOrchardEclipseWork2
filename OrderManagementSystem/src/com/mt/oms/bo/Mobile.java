package com.mt.oms.bo;

public class Mobile {

	private int id;
	private String brand;
	private double price;
	private int stock;
	public Mobile() {
		super();
	}
	public Mobile(int id, String brand, double price, int stock) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
}
