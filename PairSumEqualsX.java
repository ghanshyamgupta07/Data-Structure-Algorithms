package com.datastructure.arrays;

/*
 * Given an array we need to print all pairs for a given input value
 * for example given array is -  {2,7,5,3,9,6,1,2};
 * and if given input value is - 11
 * then pairs {2,9} ,{5,6} will be our desired pairs output
 * if given input value is - 17
 * then no pair sum equals to 17 so no output 
 * if given input value is - 2
 * then no pair sum equals to 2 so no output 
 */

public class PairSumEqualsX {

	public static void main(String[] args) {
	int [] arr = {2,7,5,3,9,6,1,2};
   	solution2(arr,14);
	System.out.println();	
	java.util.Arrays.sort(arr);
	solution1(arr,11);

	}

	/*
	 * we can sort the array and use two variable one from first index - min element in array
	 * and one from last index max element of array and check if these two sum equals to
	 * desired sum if yes print these two else increase or decrease 
	 */
	private static void solution1(int[]arr,int x) {
	
	for(int i =0 , j = arr.length-1; i<j ; ) {
	
		if(arr[i]+arr[j] == x) {
			System.out.print("pair " +arr[i] +" "+arr[j]);
			System.out.println("");
			i++;j--;
		} else if(arr[i]+arr[j]<x){
			i++;
		}else {
			j--;
		}
		
	}	
		
	}
	
	/*
	 * set contains unique elements so if we need to check pair sum for 11 
	 * and if we added 7 already element in set then now if we are adding 4
	 * then 11-4 = 7 will be present in the set and we will print these two
	 * 
	 */
	private static void solution2(int[]arr,int x) {
		
		java.util.Set<Integer> nums = new java.util.HashSet<Integer>();
		
		for(int i=0 ; i< arr.length-1;i++) {
			
			if(nums.contains(x-arr[i])){
				System.out.print("pair ->>"+(x-arr[i])+" "+arr[i]);
			} else {
				nums.add(arr[i]);
			}
		}
		
		
	}
	

}
