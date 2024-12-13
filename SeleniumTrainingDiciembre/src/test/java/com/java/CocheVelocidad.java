package com.java;

public class CocheVelocidad {
	public static void main(String[] args) {

		int limiteVelocidad = 125;
		int cocheCarretera = 230;
		int cocheZonaEscolar = 87;
		int cocheCallenormal = 123;

		if (cocheCarretera < limiteVelocidad) {
			System.out.println("El limite de velocidad es adecuado - Carretera");
		} else {
			System.out.println("Multa por rebasar el limite de velocidad - Carretera");
		}

		if (cocheZonaEscolar < limiteVelocidad) {
			System.out.println("El limite de velocidad es adecuado - Zona Escolar");
		} else {
			System.out.println("Multa por rebasar el limite de velocidad - Zona Escolar");
		}

		if (cocheCallenormal < limiteVelocidad) {
			System.out.println("No se ha rebasado el limite de velocidad - Calle normal");
		} else {
			System.out.println("Multa por rebasar el limite de velocidad - Calle normal");
		}
	}
}