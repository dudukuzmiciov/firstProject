   package com.syntax.OOP;

public class Account {
	
	private String userName="Teyfur"; //ACCESS MODIFIERS DOESNT METTER
	private String password="Admin";
	public String accountNumber="123456";
	private double balance=-1500;
	
	private void printUserName() {
		System.out.println(userName);
	}
	
	protected void printPassword() { //ACCESS MODIFIERS CONTROL IF THEY CAN BE ACCESSED OR NOT
		System.out.println(password);
	}
	

	void printBalance() {
		System.out.println(balance);
	}
	public void printAccountNumber() {
		System.out.println(accountNumber);
	}
	
	public static void main (String[] args) {
		Account account=new Account();
		System.out.println(account.userName);
		System.out.println(account.password);
		System.out.println(account.balance);
		System.out.println(account.accountNumber);
		
		/* Accessing a field directly is different from accessing
		 * the same field with methods having different access modifier*/
		
		//account.printUserName(); private access
		
		account.printUserName();
		account.printPassword();
		account.printBalance();
		account.printAccountNumber();
		
	}
}
