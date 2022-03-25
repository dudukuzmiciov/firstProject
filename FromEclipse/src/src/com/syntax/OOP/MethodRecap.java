package com.syntax.OOP;

public class MethodRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is my #0345685967 Dana";
		System.out.println(str.charAt(0));//charAt(0) shows the index zero
		System.out.println(str.charAt(3));//shows the index 3 which is e
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println("*******************");
		
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println("************************");
		
		System.out.println(str.indexOf("#"));
		
		//index of # is 11, index of the space between number and my name is 22.
		System.out.println(str.substring(12,23));
		System.out.println(str.substring(str.indexOf("#")+1,str.indexOf("#")+1+11));
	}

}
