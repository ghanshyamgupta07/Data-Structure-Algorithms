package com.datastructure.bits;

public class OddEven {

	public static void main(String[] args) {
		
		int num = 8;
		
		if((num & 1) == 1)
		System.out.println("odd no");
		else 
		System.out.println("even no");
		
		
		
		// two missing no
		int resXor = 6 ;
		int setbit = resXor & ~(resXor-1);
		System.out.println("set bit or one missing no: "+setbit);
		
		System.out.println("unset bit or other missing no : "+(resXor^setbit));
		
	}

}
