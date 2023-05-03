package singleInheritance;

import java.util.Scanner;

//Student----  parent class
//Marks -------child class


public class Student 
{
  int rollno;
  String name;
  
	Scanner sc = new Scanner(System.in);
	void inputstudent() 
	{
		System.out.println("Enter the rollno:");
			rollno = sc.nextInt();
	    
	    System.out.println("Enter the name:");	
	        name = sc.next();
	
	
	
	}
	
	
}
