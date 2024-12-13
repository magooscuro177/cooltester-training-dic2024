package com.java;

import java.util.Scanner;

public class stringConcatenado {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 55.66;
		double b = 676.55;
		double c = 87.4556;

		double suma = a + b + c;
		double resta = a - b - c;
		double division = a / b / c;
		double multiplicacion = a * b * c;

		System.out.println("La suma de los numeros a, b y c es igual a: " + suma);
		System.out.println("La suma de los numeros a, b y c es igual a: " + resta);
		System.out.println("La suma de los numeros a, b y c es igual a: " + division);
		System.out.println("La suma de los numeros a, b y c es igual a: " + multiplicacion);

		String var1 = " Cool";
		String var2 = "Selenium con Java";
		String var3 = "Curso de ";
		String var4 = " Testers";

		System.out.println("" + var3 + var2 + var1 + var4);
		
		int edad, minutos, codigoPostal, numeroDeHijos, tallaCamisa, dias, contador, tallaCamiseta;
		char letra, genero;
		double iva, alturaH, alturaM, peso, precio;
		String mensaje = "hola";
		String matriculaCoche;
		boolean alumnoRepetidor, mayorDeEdad;
		
		int x=166;
		int y=166;
		
		if (x>y) {
			System.out.println("La variable x es mayor a la variable y");
		}else if(x==y) {
			System.out.println("La variable x es igual a la variable y");
		  }else {
			System.out.println("La variable x es menor a la variable y");
		}
		
		double z;
		System.out.println("Ingrese un numero:");
		Scanner reader = new Scanner(System.in);
		z=reader.nextDouble();
		
		
		
		if (z>=0) {
			System.out.println("La variable z es un numero positivo");
		}else {
			System.out.println("La variable z es un numero negativo");
		}
		
		if (z%2==0) {
			System.out.println("La variable z es par");
		}else {
			System.out.println("La variable z es impar");
		}
		
		
	
	
	}

}
