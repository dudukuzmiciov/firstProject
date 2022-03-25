package com.syntax.OOP;

public class StringTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How would you reverse a String word by word? for example
				// input=>This is sentence i want to reverse
				// output=>sihT si ecnetnes i tnaw ot esrever
		
		StringBuilder stringBuilder=new StringBuilder("Sunday");
		System.out.println(stringBuilder.reverse());
		
		//or by building own code:
		System.out.println("**************");
		
		String  s="Sunday is great";
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		s=str.toString();
		System.out.println(s);
		
	System.out.println("*******************");
	
	          //WORD BY WORD
	
	String newStr="Sunday is amazing";
	String [] strArray=newStr.split(" ");
	for(int i=0; i<strArray.length; i++) {
		System.out.println(strArray[i]);
	}
	
	}

}
