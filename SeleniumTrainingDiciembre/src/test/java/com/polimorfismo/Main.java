package com.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
//		Clase Abstracta - Nombre de Objeto - Constructor
		Animal puppy = new Perro();
		puppy.speak();
		
		Animal gardfield = new Gato();
		gardfield.speak();
		
		Animal pablo = new Humano();
		pablo.speak();
		
		pablo = new Gato();
		pablo.speak();
		
	

	}

}
