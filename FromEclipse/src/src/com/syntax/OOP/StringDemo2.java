package com.syntax.OOP;

public class StringDemo2 {

	public static void main(String[] args) {
		
		//TRIM METHOD:
		String name="     Dana     ";
		System.out.println(name);
		System.out.println(name.trim());
		
		// startsWith METHOD
		
		String name2="Dana Grinco";
		System.out.println(name2.toLowerCase().startsWith("Dana"));//method chaining
		System.out.println(name2.startsWith("Grinco"));
		System.out.println(name2.endsWith("Grinco"));
		
		//we can also check single letters
		System.out.println(name2.startsWith("D")); 
		System.out.println(name2.endsWith("o"));
		
		//if you want to search for smthg in between
		
		System.out.println(name2.contains("r"));
		
		//EQUALS METHOD :
		
		//boolean equals(Object anObject);
		
		
	}

}
