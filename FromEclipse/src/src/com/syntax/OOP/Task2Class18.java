package com.syntax.OOP;

public class Task2Class18 {
	// Create a method that will take a String as a parameter and returns reversed
	// String. Method should be available to all classes within your project and
	// accessible by class name.

	public static String reverseString(String str) {
		
		//StringBuilder s1 = new StringBuilder(str);
		//s1.reverse();
		//return s1.toString();
		return new StringBuilder(str).reverse().toString(); //shorter recomended way
		//new StringBuilder(str) object creation
		//new StringBuilder(str).reverse().toString() calling two methods on that object
		//return new StringBuilder(str)reverse().toString();calling two methods on that
		//object and returning the result

	}
	
	public static void main(String[] args) {
		String name="Dana";
		System.out.println(Task2Class18.reverseString(name));
	}
}
