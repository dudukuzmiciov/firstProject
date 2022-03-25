package com.syntax.OOP;

public class MethodsDemo3 {
	//int we specify the data type that method will return
	//squareTheNumber is the name of the method
	//(int number) parameters of the method
	//return tell java what to return from this method
	int squareTheNumber(int number) {
		return number*number;
	}
	int returnTheSameNumber(int number) {
		return number;
	}

	String getProperAnimalByExpert(String expertName,String animalName) {
		if("Teyfur".equalsIgnoreCase(expertName)&&"Horse".equalsIgnoreCase(animalName)) {
			return "camel";
		}else if("Horse".equals(animalName)) {
			return "Horse";
		}else {
			return "I don't know";
		}
	}
	public static void main(String[] args) {
		
		MethodsDemo3 obj=new MethodsDemo3();//new MethodsDemo3 object creation
		int result=obj.returnTheSameNumber(5);
		System.out.println(result);
		
		System.out.println(obj.getProperAnimalByExpert("Teyfur","Horse"));
		System.out.println(obj.getProperAnimalByExpert("Dana","Horse"));
		System.out.println(obj.getProperAnimalByExpert("Dana","Cat"));
		
		//Create a method that takes a person name and animal name
		//if person name is Teyfur and if animal name is Horse it returns us "camel"
		
		
		
		
		

	}

}
