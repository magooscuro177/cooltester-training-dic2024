package com.java;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean shouldWakeUp = shouldWakeUp(true, 24);
	
	System.out.println(shouldWakeUp);

	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if(barking==true) {
			if(hourOfDay<8 && hourOfDay>22) {
				return true;
			}else if (barking==true && hourOfDay<0 && hourOfDay>23) {
				return false;
			}
		}
		else if (barking==false) {
			if(hourOfDay<8 && hourOfDay>22) {
				return false;
			}else if (barking==false && hourOfDay<0 && hourOfDay>23) {
				return false;
			}
		}
//		return barking;
		
	
		
		
	}
}
	




