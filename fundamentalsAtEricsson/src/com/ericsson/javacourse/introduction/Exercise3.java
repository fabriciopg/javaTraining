package com.ericsson.javacourse.introduction;

public class Exercise3 {
	
	public static void main(String[] args ) {
		String palindrome = "socorrammesubinoonibusemmarrocos";
		char[] palindromeArray = palindrome.toCharArray();
		int arrayLength = palindromeArray.length;
		
		boolean teste = true;
			
		for (int i=0; i<arrayLength/2; i++ ) {	
			if (palindromeArray[i] != palindromeArray[(arrayLength-1) - i]) {
				teste = false;
				break;
			}	
		}
			
		if (teste == true) {
			System.out.printf("The word %s is a palindrome", palindrome);
			} 
		else {
			System.out.printf("The word %s is not a palindrome", palindrome);
		}		
		
	}
}
