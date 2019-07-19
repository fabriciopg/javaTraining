package com.ericsson.javacourse.introduction;

public class Exercise2 {
	
	public static void main(String[] args) {
		String[] names = {"John", "Paul", "Ringo", "George"};
		String search = "Ringo";
		
		busca(names,search);
		
	}
	
	public static void busca(String[] set,String target) {
			
		int i = 0;
		
	    for(String name : set) {
	         if(name.equals(target)) { 
	     		System.out.print(target + " found at position " + i);
	     		return;
	         }
	         i++;
	      }
	    
     	System.out.print("Could not find " + target);
	    
	}

}
