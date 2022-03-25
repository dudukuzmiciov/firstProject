package com.syntax.OOP;

public class Task1Class18 {
	// Create a method that will accept an array as parameters and will return a sum
	// of all elements from that array. Method should be visibly only within same
	// package and accessible by the creating an instance of the class.

	    int sumArray(int [] array) {
		int sum = 0; //declare a variable  which holds sum and initialize it with zero
		for (int num:array)//whenever we need to just access the elements we go for a for loop.
		{
			sum += num; //+= means i   terating its value. for ex: if i=10, i+= means i becomes 20.
		}
		return sum;
	}
	
}

