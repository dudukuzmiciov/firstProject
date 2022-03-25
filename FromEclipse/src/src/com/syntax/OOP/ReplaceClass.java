package com.syntax.OOP;

public class ReplaceClass {

	public static void main(String[] args) {
		String str="Batch 12 is good";
		System.out.println(str.replace("good","Great"));
		System.out.println(str.replace("o","0"));
		System.out.println(str.replace(" ","_"));
		System.out.println(str.replace(" ",""));//"" works like a remover "Batch12isgood
		System.out.println(str.replace("12","13"));

	}

}
