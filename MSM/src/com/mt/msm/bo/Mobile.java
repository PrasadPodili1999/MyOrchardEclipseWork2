package com.mt.msm.bo;

public class Mobile {

	private int id;
	private String model;
	private double price;
	private String dateOfManufacture;
	public Mobile()
	{
		super();
	}
	public Mobile(int id, String model, double price, String dateOfManufacture) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.dateOfManufacture = dateOfManufacture;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	
	
}
