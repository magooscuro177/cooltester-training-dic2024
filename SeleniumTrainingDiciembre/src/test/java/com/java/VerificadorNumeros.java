package com.java;

public class VerificadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printEqual(7,7,7);
		
		
	}

	
	public static void printEqual (int x, int y, int z) {
		
		if (x==y && x==z){
			System.out.println("Todos los números son iguales");
		}else if (x<0 || y<0 || z<0) {
			System.out.println("Valor no válido");
		}else if (x!=y || x!=z || y!=z) {
			System.out.println("Todos los números son diferentes");
		}
	
		
	}
}
