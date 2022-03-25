package com.syntax.OOP;

public class camelHorse {
	//create a method that takes an animal and person name.
	//if name is equal to Teyfur and animal is horse,
	//print camel otherwise print horse:
	
	void animalCheck(String personName,String animalName) {
		if("Teyfur".equalsIgnoreCase(personName)&&"Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a camel");
		}else if("Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a horse");
		}
	}
public static void main(String[] args) {
	camelHorse obj=new camelHorse();
	obj.animalCheck("Teyfur","Horse");
	obj.animalCheck("Tarik","Horse");
}
}
