package com.datastructure.bits;

public class Miss_Repeat_Nums {

   public static void main(String[] args) {
		
     int [] arr = {1, 2,3, 5, 6,7};
     twoMissingNums(arr,8);	
     
     int [] arr1 = {1, 2,3, 5, 6,7,7};
      oneMissOneRepeatNum(arr1,arr1.length);	
}
	
private static void oneMissOneRepeatNum(int[] arr, int n) {
	
	int xor = 0;	
	for (int i = 0; i < arr.length; i++) {
	 xor = xor ^ arr[i]^(i+1);	
	}
	
	System.out.println(xor);
	
	int first = xor & ~(xor-1);
	int second = xor^first;
        System.out.println("missing and repeating nums are: "+first+" "+second);	
	
}

	public static void twoMissingNums(int[] arr,int n) {
	
	int xor = 0;
	int i=0;
	for (; i < arr.length; i++) {		
		xor = xor ^ (i+1) ^ arr[i];
	}	

	// xor = xor^(i+1)^(i+2);
	xor = xor^(n)^(n-1);
	
	int first = xor & ~(xor-1);
	int second = xor^first;
	
	System.out.println("missing nums are: "+first+" "+second);
		
	}

}
