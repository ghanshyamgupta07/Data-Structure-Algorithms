package com.leetcode.algorithms;

import java.util.Arrays;


public class Problem27_Remove_Element {

	static int[][] testcases = { {}, { 1 }, { 1, 1 }, { 1, 1, 2, 2, 3, 3 }, { 1, 1, 2 }, { 1, 2, 2 } };

	public static void main(String[] args) {
		
		for (int i = 0; i < testcases.length; i++) {
			
			System.out.println("input array: "+Arrays.toString(testcases[i]));
			int l = removeValue(testcases[i],1);
			System.out.println("final array length :"+l);
		 			
			System.out.println("input array: after run "+Arrays.toString(testcases[i]));
			
			System.out.println("-----------------------------------");
		    
		}

	}

	public static int removeValue(int[] arr,int val) {

		if (arr.length < 1)
			return arr.length;

		// take 2 pointers i and j , i will track distinct values index while j will compare with value to remove and copy to i pointer
		// in case we dont need to remove the value and proceed further
		
		
		int i = -1;  // assuming all array element might be same as val to be removed
		int j = 0;
		while (j < arr.length) {
			// if array element is not the val copy this to postion pointed by i
			if (arr[j] != val)
				arr[++i] = arr[j];
			// else simplly keep proceeding
			j++;
		}
		return i + 1;
		// return the length of array pointing to elements which are not val
	}
}
