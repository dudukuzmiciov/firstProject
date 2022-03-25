package com.syntax.OOP;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name="dana";//<--ALWAYS USE THIS /ITS SHORTER THAN THE NEXT ONE:
		
		String name2=new String("dana ");//if we add space, it will also count as a caracter
		
		System.out.println(name);
		System.out.println(name2.length());//LENGTH IS  A METHOD INSIDE THE STRING CLASS
		
		System.out.println(name.length());//counts how many letters the string has

		//LOWER CASE METHOD:
		//return type of this method is a STRING
		
		String name3="DANIELA is cute";
		String newName=name3.toLowerCase();
		System.out.println(name3.toLowerCase());
		System.out.println(name3.toUpperCase());
		
		System.out.println(name+name2);//recomended method to perform concatination-->
		System.out.println(name.concat(name2));
		
		
		name="";//will get a true
		System.out.println(name.isEmpty());//isEmpty checks if name contains something
		name="    ";//will get a false because we have a space in this case in between the brackets
		System.out.println(name.isEmpty());
		
	
		
	}

}
