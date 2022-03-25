package com.syntax.OOP;

public class ReverseAsentence {

	public static void main(String[] args) {
		/* get the words from syntax,reverse the words,  
		 * append the words to get the sentence back*/
		
		String s = "Sunday is great"; //This is a string inside the main method
		
		ReverseAsentence str=new ReverseAsentence(); //created the class object
		//System.out.println(str.reverseString(s)); /*This syso will reverse the
		//whole sentence but will not reverse the words position (the arrays pos.)
		
		String[] strArray=s.split(" "); //split the string into words
		//System.out.println(strArray[0]); //Will print out the first array 
		// Sunday (unreversed) or any array we choose to in []
		
		for(int i=0;i<strArray.length;i++) {
			System.out.print(str.reverseString(strArray[i])+" ");//first iteration gives "Sunday"[i]
			//then it prints and inputs space (+" "), then second iteration picks "if"....
		}
		

	}
	String reverseString(String inputString) { //the method that will reverse the string
		//converting S string to StringBuilder so that we can use the reverse method
		StringBuilder stringBuilder=new StringBuilder(inputString);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}

}
