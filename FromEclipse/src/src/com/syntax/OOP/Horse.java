package com.syntax.OOP;

public class Horse {
	//atributes,fields, properties:
		private String name;
		private String breed;
		private int age;
		double weight;
		//defining behaviours, function:
		void run() {
			System.out.println(name+" is running");
		}
		void eat() {
			System.out.println(name+" is eating");
			
		}
		void printCompleteInfo() {
			System.out.println("name ="+name);
			System.out.println("breed ="+breed);
			System.out.println("age ="+age);
			System.out.println("weight ="+weight);
		}
		
		public static void main(String[] args) {
			//create the object of the class:
			//danasHorse is an object- its an object cuz is created from a class
			Horse danasHorse=new Horse();
			danasHorse.name="spirit";
			danasHorse.breed="stallion";
			danasHorse.weight=800;
			danasHorse.age=20;
			danasHorse.run();
			//run and eat are methods
			danasHorse.printCompleteInfo(); //method
			
			System.out.println("******************");
			
			Horse romasHorse=new Horse();
			//accessing the property name on object romas horse and setting its value
			romasHorse.name="Sobchak";
			romasHorse.breed="Mustang";
			romasHorse.age=15;
			romasHorse.run();
			romasHorse.printCompleteInfo();//print all the information of the object
			
			
			
			

		}

	}

