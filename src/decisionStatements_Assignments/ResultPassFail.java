package decisionStatements_Assignments;

import java.util.Scanner;

//WAP to input student marks by condition :
//a) Marks is greater than 0 and less than 50--FAIILED
//b) Marks is greater than 50 and less than 75--1st Class
//c) Marks greater than 75 –and less than 100 Distinction

public class ResultPassFail {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		
		if (marks<=49) 
		{
			System.out.println("Result is : Fail");
		}
		else if(marks<=75)
		{
			System.out.println("Result is : 1st Class");
		}
		else
		{
			System.out.println("Result is : Distinction");
		}
		

	}

}
