package com.leetcode.algorithms;

public class Problem_7_Reverse_Integer {
	public static void main(String[] args) {
		 int[] testcases = { 1, -2345,98763,1238989898,-1222111 };
		 for (int input_num :  testcases) {				
				System.out.print("input number:  "+ input_num);
				int result = reverse(input_num);
				System.out.println(" reversed value "+result);			    
			}
	}
	public static int reverse(int x) {
		// assuming input no is not negative
		boolean is_negative = false;
		// if input no is -ve , we will make it +ve to process and update flag is_negative to true.
		if(x<0){
			is_negative = true;
			x = x *(-1);
		}
		// logic to reverse an integer i.e 123 to 321
		long res = 0;
		while(x > 0){
			res = res*10 + x%10;
			x=x/10;        
		}
		// as per problem statement if result is out of integer range then return 0; 
		if(res>Integer.MAX_VALUE) return 0;    
		// update result i.e negate it in case input was -ve num
		if(is_negative) res = res * (-1);
		
		return (int)res;
	}

}

