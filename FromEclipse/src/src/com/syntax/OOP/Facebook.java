package com.syntax.OOP;

public class Facebook {
	
	private String userName;
	private String password;
	private int age;
	
	void setAge(int personAge) { //SET is a SETTER METHOD which takes the value
		if (personAge>5 && personAge<80) {
			age=personAge;
			}else {
				System.out.println("Not allowed");
			}
	}
	
	int getAge(String userPassword) { //GET is a Getter method that expects a return 
		//protecting the age with password
		if(userPassword.equals(password)) {
			return age;
		}else {
		return -1;
	}

	}
}
