package com.syntax.OOP;

public class Greeting {
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
		
	}
	void sayHelloManyTimes(String name) {
		for(int i=0;i<5;i++) {
		System.out.println("Hello "+name);
		}
	}
	void sayHelloNumerousTimes(String name, int times) {
		for (int i=0;i<times;i++) {
			System.out.println("Hello "+name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greeter=new Greeting();
		greeter.sayHelloManyTimes("Dana"); 
		greeter.sayHelloNumerousTimes("Dana",10);
		
		//if we want to print one time,
		//type greeter.sayHello("Dana") using the method from lime 5 OR:
		//if we want to print 5 times, greeter.sayHelloManyTimes from method on line 9.
		//and if  we want to print 10 or 100 or whatever times, we use the  3rd method 
		//on line 14, where we also declared an int besides the string, and call the 
		//method in line25, specifying whatever the number  we want to be printed.
		
	}

}
