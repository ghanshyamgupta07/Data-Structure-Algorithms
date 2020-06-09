package others;

/*
 * given an input string and if we want to print all the words containing
 * any char  
 */

public class PrintWordsContaingSpecialChar {

	public static void main(String[] args) {

		String input = "my name is lakhan brother of ram";
		char c = 'a' ;
		printSpecificWords(input);	

	}

	public static void printSpecificWords(String input){
		
		// if string is null then return
		if(null == input)
			return;
		
		// break the string into words	
		String [] words = input.split(" ");	

		// iterate the array i.e words
		for(int i=0 ; i<words.length;i++){
			// if word contains char 'a' then print it	
			if(words[i].contains("a")){
				System.out.println(words[i]);
			}

		}


	}

}
