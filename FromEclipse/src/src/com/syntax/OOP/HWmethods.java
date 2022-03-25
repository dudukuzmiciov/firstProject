package com.syntax.OOP;

public class HWmethods {
	//task 1: Create a method that will take 2 parameters 
	//as a numbers and prints which number is larger.
	//  Return type of this method should be "void method"
	int getLargest(int number1, int number2) {
		if (number1>number2) {
			return number1;
		}else {
			return number2;
		}
	}
	//same task nr.1 but the correct way:
	void printLarger(int num1,int num2) {
		if(num1>num2) {
			System.out.println("Number 1 is greater");
		}else if(num2>num1) {
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("Number are same");
		}
	}
	
	// task2:Create a method that will take a number and 
	//prints whether the number is even or odd
	void checkNumber(int number3) {
		if (number3%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		//task 1
		HWmethods number=new HWmethods();
		int bigest=number.getLargest(65,2022);
		System.out.println(bigest);
		//task 1 correct way
		HWmethods object=new HWmethods();
		object.printLarger(10,12);
		object.printLarger(12,10);
		object.printLarger(10,10);

		//task 2
		HWmethods numberCheck=new HWmethods();
		numberCheck.checkNumber(33);
		numberCheck.checkNumber(100);
	}

}
