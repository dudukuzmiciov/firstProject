package com.syntax.OOP;

public class emailMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="Asel";
		String password="pass1234Asel";
		String confirmedPassword="pass1234Asel";
		emailMethod task1=new emailMethod();
		task1.checkUserNamePassword(userName, password, confirmedPassword);
	}
	
	void checkUserNamePassword(String userName,String password,String confirmedPassword) {
		
		if(userName.isEmpty()  || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else {
		
			if(password.length()<8) {
				System.out.println("Password is too short");
			}else {
				if(password.contains(userName)){
					System.out.println("Password cannot contain username");
				}else {
					if(password.equals(confirmedPassword)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
				}
			}
		}
	}
}


