package com.java;

public class megaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMegaBytesAndkiloBytes (-2500);
		
	}
	
	public static void printMegaBytesAndkiloBytes (int kiloBytes) {
		
		if(kiloBytes>0) {
		
		int megaBytes= kiloBytes / 1024;
		int kiloBytes1= megaBytes * 1024;
		int kiloBytesrest= kiloBytes - kiloBytes1;
		
		System.out.println(kiloBytes+" KB = "+megaBytes+" MB y "+kiloBytesrest+" KB");
		
	}else {
		System.out.println("Valor no valido");
	}

}
}