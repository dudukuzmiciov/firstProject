package com.syntax.OOP;

public class VowelsMethods {
	
	private static String onlyVowels(String input) {
		//LONG WAY:
		// String newStr=input.replaceAll("[aeiouAEIOU]","");
		//return newStr;
		
		//SHORT WAY
		return input.replaceAll("[^aeiouAEIOU]","");
	}

	public static void main(String[] args) {
		System.out.println(onlyVowels("Emili"));
		
		/* Create a method that will accept a String as a parameter 
		 * and return a new String that consist only vowels.
		 * Method should be available inside the class only where it
		 * was declared and executed by calling it is name.
		 */
		

	}

}
