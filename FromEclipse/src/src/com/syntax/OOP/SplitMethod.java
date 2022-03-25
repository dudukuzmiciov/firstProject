package com.syntax.OOP;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String s="This is a sentence";
		String []strArr=s.split(" ");
		System.out.println(Arrays.toString(strArr));
		//this-index1, is-index2, a-index3, sentence-index4
		
		System.out.println(strArr.length);//4
		System.out.println(strArr[0]);//console This
		System.out.println(strArr[3]);//console sentence
		 
		String s2 = "This is  a sentence. Batch 12 is great. Edward is not great. He is super great";
		String[] strArr2=s2.split("[.]");
		System.out.println(strArr2.length);
		System.out.println(strArr2[3].trim());
		
		

	}

}
