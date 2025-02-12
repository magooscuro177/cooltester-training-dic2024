package com.java;

public class isCatPlaying {
	public static void main(String[] args) {
	
	boolean isCatPlayingg1 = isCatPlayingg (false, 35);
	boolean isCatPlayingg2 = isCatPlayingg (false, 36);
	boolean isCatPlayingg3 = isCatPlayingg (true, 10);
	
	
	System.out.println(isCatPlayingg1);
	System.out.println(isCatPlayingg2);
	System.out.println(isCatPlayingg3);
	
	
}

	public static boolean isCatPlayingg (boolean verano, int temperatura) {
		// TODO Auto-generated method stub
		
		/* System.out.println("Ingrese la temperatura actual: "+temperatura);*/
	
		if(verano==true) {
			
		if(temperatura>=25 && temperatura<=45){
			return true;
		}
		else {
			return false;
		}
		}
		else if (verano==false && temperatura>=25 && temperatura<=35){
			return true;
		}else {
			return false;
		}

	}
	}


