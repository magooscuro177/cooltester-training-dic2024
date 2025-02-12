package com.java.herencia;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre padre1 = new Padre ("Jose", 1.78);
		
		Hijo hijo1 = new Hijo ("Juan", 1.72);
		
		Nieto nieto1 = new Nieto ("Juanito", 1.45);
		
		System.out.println("El color de ojos de Jose es: "+padre1.colorOjos(null));
		System.out.println("El color de ojos de Juan es: "+hijo1.colorOjos(null));
		System.out.println("El color de ojos de Juanito es: "+nieto1.colorOjos(null));
		System.out.println("El color de cabello de Juanito es: "+nieto1.colorCabello(null));
		System.out.println("La profesion de Juanito es: "+nieto1.Profesion(null));
	}
}
