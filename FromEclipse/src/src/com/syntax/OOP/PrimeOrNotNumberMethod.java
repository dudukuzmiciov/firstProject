package com.syntax.OOP;

public class PrimeOrNotNumberMethod {
	//Write a method to return whether given number is prime or not?
	
	boolean isPrime(int number) {
		
		boolean isPrime =true;
		
		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		
		PrimeOrNotNumberMethod obj=new PrimeOrNotNumberMethod();
		System.out.println(obj.isPrime(12));
		
//why i=2? is this a fixed code to identify a prime or not num?
		//why in first statement "if"  its says isPrime=false? and then same in else statement.
	}

}
