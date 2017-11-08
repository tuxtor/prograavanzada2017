package com.nabenik.demo.poo;
public class Book {
	
	private String name; //null
	private Author autor; //null
	private double price; //0.0
	private int qty; //0
	
	public Book(String name, Author autor, double price, int qty) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.qty = qty;
	}

	
	
	@Override
	public String toString() {
		return name + " by " + autor.getName() 
		+ "(" + autor.getGenere() + ") at " + autor.getEmail();
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAutor() {
		return autor;
	}
	public void setAutor(Author autor) {
		this.autor = autor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
