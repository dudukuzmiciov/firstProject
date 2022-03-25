package com.syntax.OOP;

public class CreateEmailMethod {
	// * Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	
	String createEmail(String userName, String lastName,String emailType) {
		return userName+lastName+"@"+emailType+".com";
		
	}

	public static void main(String[] args) {
		CreateEmailMethod obj=new CreateEmailMethod();
		System.out.println(obj.createEmail("Zull","fyia","gmail"));
		

	}

}
