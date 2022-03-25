package com.syntax.OOP;

public class Phone {

	// Create a class "phone". Create 3 objects of it: iPhone, Pixel, Nokia
	// with specific atributes and behaviours

	String phoneType;
	String model;
	String phoneNumber;
	int noOfCams;
	String color;
	double screenSize;
	String os;

	
	

	void makeCall() {
		System.out.println("calling " + phoneNumber);
	}

	void takePictures() {
		System.out.println(model + " is ringing");
	}

	void printCompleteInfo() {
		System.out.println(phoneType + "= phoneType");
		System.out.println(model+ "= model");
		System.out.println(phoneNumber + "= phone number");
		System.out.println(noOfCams + " cameras");
		System.out.println(color+ " is the phone color");
		System.out.println(screenSize+ " screen size");
		System.out.println(os+ " os");
	}

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.phoneType="iphone";
		iphone.model="iphone 13 pro max";
		iphone.noOfCams=3;
		iphone.color="blue";
		iphone.screenSize=6.8;
		iphone.os="IOS";
		iphone.phoneNumber="578966855";
		iphone.makeCall();
		iphone.takePictures();
		iphone.printCompleteInfo();
		

		System.out.println("***************");

		Phone nokia = new Phone();
		nokia.phoneType="nokia";
		nokia.model="nokia 13 pro max";
		nokia.noOfCams=3;
		nokia.color="blue";
		nokia.screenSize=6.8;
		nokia.os="IOS";
		nokia.phoneNumber="578966855";
		nokia.makeCall();
		nokia.takePictures();
		nokia.printCompleteInfo();
		

		System.out.println("******************");

		Phone pixel = new Phone();
		pixel.phoneType="pixel";
		pixel.model="pixel 13 pro max";
		pixel.noOfCams=3;
		pixel.color="blue";
		pixel.screenSize=6.8;
		pixel.os="IOS";
		pixel.phoneNumber="578966855";
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();
		

	}

}
