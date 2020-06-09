package others;
/*
 * merge two sorted array
 *  
 */
public class MergeSort {

	public static void main(String[] args) {

		int [] arr1 = {1,3,5,7};
		int [] arr2 = {2,4,6,10,12};
		//call merge and store the merged array in res array
		int [] res = merge(arr1,arr2);
		// print the resultant array 
		for(int i=0 ; i<res.length ;i++){
			System.out.print(res[i]+" ");
		}

	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// if fist array is null or empty then return second array
		if(arr1 == null || arr1.length == 0)
			return arr2;
		// similarly if second array is null or empty then return fist array
		if(arr2==null || arr2.length ==0)
			return arr1;
		// final array-> arr3 length = first array length + second array length
		int newLength = arr1.length+arr2.length;	
		int[] arr3 = new int[newLength];

		for(int i=0,j=0,k=0;k<newLength;){
			// if element of first array less then element of second array
			// then store the first array element into resultant arr - arr3
			if(arr1[i]<arr2[j]){
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			// else store the second array element into resultant arr - arr3
			else{
				arr3[k] = arr2[j];
				j++;
				k++;
			}
			// if first array finished - all element has been copied 
			// then store all element of second array into resultant array
			if(i==arr1.length){
				while(j<arr2.length){
					arr3[k] = arr2[j];
					j++;
					k++;
				}
			}	
			// if second array finished - all element has been copied 
			// then store all element of fist array into resultant array
			if(j==arr2.length){
				while(i<arr1.length){
					arr3[k] = arr1[i];
					i++;
					k++;
				}
			}	

		}
		return arr3;

	}

}
