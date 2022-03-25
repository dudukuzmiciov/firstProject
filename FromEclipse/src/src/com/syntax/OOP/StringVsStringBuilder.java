package com.syntax.OOP;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dana is Great";//original string
		System.out.println(s.replace(" ",""));
		System.out.println(s);
		
		StringBuilder stringBuilder=new StringBuilder("Dana is Great");
		
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder);
		
		System.out.println("*******************");
		    String s1= new String("Asghar Is Great");//
		    s.concat("hahah");//add new  String hahah to the original string
		   // System.out.println(s.concat("hahah"));
		    System.out.println(s1);// printing out the original string

		    StringBuilder stringBuilder1=new StringBuilder("Asghar Is Great");

		    stringBuilder.append("Hahha");
		   // System.out.println(stringBuilder.append("Hahha"));
		    System.out.println(stringBuilder1);
		}

	}



