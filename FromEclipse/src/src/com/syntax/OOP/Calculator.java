package com.syntax.OOP;

public class Calculator {

	// devide is the method name that we insert in syso
	// also the method we will use in the tester class
	// *if the method name is different than the operation you want to use, it is
	// not going to work
	void devide() {
		int number1 = 10;
		int number2 = 10;
		System.out.println(number1/number2);
	}
	
	void devideNumbers(int number1,int number2) {
		System.out.println(number1/number2);
	}
}
