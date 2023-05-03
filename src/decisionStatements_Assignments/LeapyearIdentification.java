package decisionStatements_Assignments;

//WAP that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class LeapyearIdentification {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Year");
	int year = sc.nextInt();
	
	if (year%4==0)
	{
		System.out.println("Result is : Leap Year");
	}
	else 
	{
		System.out.println("Result is :Not a Leap Year");
	}
	
	

	}

}
