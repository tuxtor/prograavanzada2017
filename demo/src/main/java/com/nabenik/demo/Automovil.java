package com.nabenik.demo;

/**
 * Clase dedicada a crear automoviles
 * @author tuxtor
 *
 */
public class Automovil { //Nombre clase sustantivo, singular
	
	private int cantidadPuertas;
	private String color;
	private int annoProduccion;
	
	
	
	
	@Override
	public String toString() {
		return "Automovil [cantidadPuertas=" + cantidadPuertas + ", color=" + color + ", modelo=" + annoProduccion + "]";
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModelo() {
		return annoProduccion;
	}

	public void setModelo(int modelo) {
		this.annoProduccion = modelo;
	}

	/**
	 * Indica que el automovil esta avanzando
	 */
	public void avanzar(){ 
		System.out.println("Soy ".concat(this.toString()));
		
	}
	
	/**
	 * Indica que el automovil esta frenando
	 */
	public void frenar(){
		System.out.println("Soy un auto y freno");
	}

}
