package com.nabenik.demo.poo;

public class Vehicle {
	
	
	
	public Vehicle() {
		super();
	}
	public Vehicle(String color, String brand, int model) {
		super();
		this.color = color;
		this.brand = brand;
		this.model = model;
	}
	
	public String color;
	public String brand;
	public int model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}

}
