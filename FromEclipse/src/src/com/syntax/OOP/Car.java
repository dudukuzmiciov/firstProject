package com.syntax.OOP;

public class Car {

	String name; //these are instance variables
	String make;
	String color;
	String type;
	
	Car(String name, String make, String color, String type){
		/*
		 * If we have same local and instance variables, javaalways prefer local variables,
		 * if you want to instruct java to use instance variables we use "this"keyword
		 */
		this.name=name;
		this.make=make;
		this.color=color;
		this.type=type;
		
	}
	Car(){
		
	}
	void printCar(){
		String name="Tesla";
		System.out.println(name);
		System.out.println(this.name); //this will print out a null in tester class
		                               //because it calls the instance variable for line5
	}
}
