package com.ericsson.javacourse.introduction;

public class Exercise1 {

	public static void main(String[] args) {
		
		int[] array = {1,9,5,3,100,2,8,25,78};
		
		highest(array);
	}
	
	public static void highest(int[] valores) {
		
		System.out.println("Number of elements in the array: " + valores.length);
		
	    int max = 0;
	    int position = 0;

	    for(int i = 0; i < valores.length; i++ ) {
	         if(valores[i]>max) {
	            max = valores[i];
	            position = i;
	            
	         }
	      }
		
		System.out.println("Highest value is: " + max);
		System.out.println("Position: " + position);
	}
}
