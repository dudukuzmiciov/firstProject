package com.syntax.OOP;

import com.syntax.OOP.Students;

public class Students {

		// TODO Auto-generated method stub
		//Create a Class called Students
		//Create three  variables  Name , ID  and  numberOfStudents
		//Create three objects of the Students Class
		//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
		//Print out  total number of students
		
		String name;
		int ID;
		static int numberOfStudents;
		
		
		public static void main(String[] args) {
			Students student1=new Students();
			student1.name="Obama";
			student1.ID=89;
			numberOfStudents++;
			
			Students student2=new Students();
			student2.name="Trump";
			student2.ID=666;
			numberOfStudents++;
			
			Students student3=new Students();
			student3.name="Biden";
			student3.ID=87;
			numberOfStudents++;
			
			System.out.println("Total amount of students = "+numberOfStudents);
			
			
	}

}
