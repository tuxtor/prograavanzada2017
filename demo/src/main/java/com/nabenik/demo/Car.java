package com.nabenik.demo;

/**
 * 
 * @author tuxtor
 *
 */
public class Car extends Vehicle {
	
	

	public Car(int wheelsQty, int doorsQty) {
		super();
		this.wheelsQty = wheelsQty;
		this.doorsQty = doorsQty;
	}
	
	public int wheelsQty;
	public int doorsQty;
	
	public int getWheelsQty() {
		return wheelsQty;
	}
	public void setWheelsQty(int wheelsQty) {
		this.wheelsQty = wheelsQty;
	}
	public int getDoorsQty() {
		return doorsQty;
	}
	public void setDoorsQty(int doorsQty) {
		this.doorsQty = doorsQty;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [wheelsQty=" + wheelsQty + ", doorsQty=" + doorsQty + ", color=" + color + ", brand=" + brand
				+ ", model=" + model + "]";
	}
	
}
