package com.syntax.OOP;

public class StringTask3 {

	public static void main(String[] args) {
		// You have a String a=”Is it saturday? 
		//Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?

		String a= " Is it saturday? Is it raining? Do we have Java Class today?";
		System.out.println(a.length());//this is a method  coming from a string class
		//to count the number of characters.
		
		System.out.println(a.split("[?.!]").length);//length property inside an array to
		//check the number of elements  in an array
	}

}
