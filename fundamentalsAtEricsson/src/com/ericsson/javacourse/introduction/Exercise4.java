package com.ericsson.javacourse.introduction;

public class Exercise4 {

	private static final String[] MONTHS = {"January", 
	           "February",
	           "March",
	           "April",
	           "May",
	           "June",
	           "July",
	           "August",
	           "September",
	           "October",
	           "November",
	           "December"};	
	
	public static void main(String[] args) {	
				
		int month = 6;
		
		System.out.print("The month is " + MONTHS[--month]);
	}
}
