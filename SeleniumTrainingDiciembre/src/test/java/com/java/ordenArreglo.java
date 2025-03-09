package com.java;

import org.apache.poi.util.SystemOutLogger;

public class ordenArreglo {
	
	int[] array= {1,3,4,6,6,3,1,8,9,3};
	// Imprimir solo los valores sin repetir

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ordenArreglo var= new ordenArreglo();
		var.array();
		
		double suma3Numeros = suma3Numeros(8.33,4.5,32.2);
		System.out.println(suma3Numeros);
	}
	
	public void array() {
		int lengtharray = array.length;{
			for(int i=0; i<lengtharray; i++)
				for(int j=1; j<lengtharray; j++) {
					if(array[i] != array[j]) {
						System.out.println("Numero: "+array[i]);
						
					}
					
				}
				
			
		}
	}
	
	public static double suma3Numeros(double x, double y, double z) {
		return x+y+z;
	}

}
