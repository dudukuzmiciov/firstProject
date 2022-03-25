package com.syntax.OOP;

public class AccountTester {

	public static void main(String[] args) {
		Account account=new Account();
		//System.out.println(account.userName);    <-- cant be called cuz its private
		//System.out.println(account.password);
		//System.out.println(account.balance);
		//System.out.println(account.accountNumber);
		
		//accessing a field directly is diferent from accessing
		//the same field with methods having different access modifier 
		
		//account.printUserName(); -->private access
		account.printPassword();
		account.printBalance();
		account.printAccountNumber();
		

	}

}
