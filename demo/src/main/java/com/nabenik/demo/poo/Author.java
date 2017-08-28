package com.nabenik.demo.poo;

/**
 * Java Bean que representa la clase autor 
 * @author tuxtor
 *
 */
public class Author {
	private String name;
	private String email;
	private char genere;
	
	public Author(String name, String email, char genere) {
		super();
		this.name = name;
		this.email = email;
		this.genere = genere;
	}
	
	@Override
	public String toString() {
		return  name + " " + genere + "at" + email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGenere() {
		return genere;
	}
	public void setGenere(char genere) {
		this.genere = genere;
	}
	

}
