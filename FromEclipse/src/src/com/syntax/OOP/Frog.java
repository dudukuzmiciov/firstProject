package com.syntax.OOP;

public class Frog {
	String name;
	String color;
	int age;
	double weight;
	
	public Frog(String name,String color,int age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public Frog(String name,String color,int age,double weight) {
		//this() should be the first line in constructors body
		
		this(name, color, age);
		this.weight=weight;
	}
	void printInfo() {
		//this() not allowed inside the methods
		//this(name,color,age);
		System.out.println(name+" "+color+" "+age+" "+weight);
	}
}
