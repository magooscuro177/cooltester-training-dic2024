package com.java;

public class MainPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Perro chihuahua = new Perro();
//	chihuahua.raza="cabeza de venado";
//	chihuahua.color="blanco";
//	chihuahua.nombre="ramiro";
//	chihuahua.numeroPatas=4;
//	chihuahua.tamano="chico";
	
	Perro perro1 = new Perro("Chihuahua", "Cafe", "Chico", "Mero Macho");
//	perro1.raza="Pomeriano";
//	perro1.color="Azul";
//	perro1.tamano="Grande";
	
	perro1.setRaza("Pomeriano");
	
	perro1.setNumeroPatas(9);
	
	System.out.println("La raza de perro 1 es: "+perro1.getRaza());
	System.out.println("El numero de patas de perro 1 es:"+perro1.getNumeroPatas()+" patas");
	
	
	Perro perro2 = new Perro("San Bernardo","blanco","grande","Cool",3);
	
	
		
	}
	
	

}
