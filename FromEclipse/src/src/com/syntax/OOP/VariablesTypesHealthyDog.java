package com.syntax.OOP;

public class VariablesTypesHealthyDog {
	
	    // when the information is expected to be different from object to object
	    //we store that information in an instance variable
	
	    String name; //instance variable
	    String color; //instance variable
	    //if we know that a value will stay same for all the objects of a class
	    // we create a static variable for that why because
	    static int numberOfLegs=4; //static variable
	    
	    
	    void eat(){
	        int noOfTimes=3; //local variable
	        System.out.println(name+ " eats "+noOfTimes);
	    }

	    void sleep(){
	      //  System.out.println(name+" sleeping"+noOfTimes); can access local variables in other methods
	    }

	    public static void main(String[] args) {
	    	//creating an object -->
	    	VariablesTypesHealthyDog dog=new VariablesTypesHealthyDog(); //dog is a local variable

	        dog.name="scooby";// when calling a local variable, use the object name
	        dog.color="Pink";//when calling a static variable, use the class name
	        VariablesTypesHealthyDog.numberOfLegs=4;
	        dog.eat();

	        VariablesTypesHealthyDog dog2=new VariablesTypesHealthyDog();
	        dog2.name="tomy";
	        dog2.color="Navi blue";
	        System.out.println(VariablesTypesHealthyDog.numberOfLegs);
	        dog2.eat();

	    }

	}

