package com.syntax.OOP;

public class PalindromeBoolean {

	
		public static void main(String[] args) {
		    // How would you check if String is Palindrome or not?
		   //Example1: aba ---> true aba
		  // Example2: Abbc --> false cbbA
		    PalindromeBoolean task=new PalindromeBoolean();
		    System.out.println(task.isPalindrome("aba"));
		    System.out.println(task.isPalindrome("Abbc"));

		}

		boolean isPalindrome(String inputStr){ //Boolean argument starts with "is".
			// (imputStr) - passing an argument (which is a string)
			//first checks the original string that we passed "Abbc"
			//"isPallindrome is the method
			//"inputString is a variable
			
		    String reversedStr=reverseString(inputStr);// reversing a word . here we call the method
		    //without creating an object (because we dont have the "static" keyword.
		    //returns the reversed string "cbbA"
		    
		    return reversedStr.equals(inputStr); // checking if words are Palindrome
		    //.equals method returns a boolean. 
		    //we return the method without writing an if else condition

		}

		String reverseString(String inputString){ //This is the method that is  reversing stuff
		    //converting S string to StringBuilder so that we can use the reverse method
			//"reverseString" is the method
			//"inputString" is the variable
			
		    StringBuilder stringBuilder=new StringBuilder(inputString);
		    stringBuilder.reverse();
		    return stringBuilder.toString();
		}
	}


