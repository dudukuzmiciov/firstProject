package com.syntax.OOP;

public class LanguageMethod {
// Create a method that will say Hello in different language based 
//on the country that will passed when method is executed.
	
	String sayHello(String country) {
		
		switch (country) {
		case "Romania":
			return "Salut";
		case "Russia":
			return "Privet";
		case "Spain":
			return "Holla";
		case "USA":
			return "Hi";
			default:
				return "Unknown";
		
		}
		
	}

	public static void main(String[] args) {
		LanguageMethod language =new LanguageMethod();
		String country=language.sayHello("Romania");
		System.out.println(country);
		
		
		

	}

}
