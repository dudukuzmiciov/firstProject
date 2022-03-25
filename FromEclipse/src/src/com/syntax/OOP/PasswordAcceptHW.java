package com.syntax.OOP;

public class PasswordAcceptHW {
	public static void main(String[] args) {
	//1.Accept username, password and confirm password from a user and check following requirements:
	//2.Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
	//3.Password should be minimum 8 characters, if less → message=”Password is too short”.
	//4.Password cannot contain username if so, → message=”Password cannot contain username”.
	//5.Password should match confirmed password, if not  → message=“Passwords do not match”.
	//6.Only after all requirements met → message “Your username and password has been created”
	
	//1:
	String  userName="danagrinco";
	String password="NewYork";
	if (userName.equals("danagrinco")&&password.equals("NewYork")) {
		System.out.println(userName.isEmpty());
	}
	
	}
}


