package com.java.herencia;

public class Hijo extends Padre {

	public Hijo(String nombre, double estatura) {
		super(nombre, estatura);
		// TODO Auto-generated constructor stub
	}
	
	public String colorCabello (String colorcabello) {
		return "Negro";
	}
	
	public String Profesion (String trabajo) {
		return "Ingeniero en computación";
	}

}
