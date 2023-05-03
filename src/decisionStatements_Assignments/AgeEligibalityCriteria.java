package decisionStatements_Assignments;

import java.util.Scanner;

//5.Write a program ask the age from user to check the eligibility age for Rollar
//Coaster according to the following conditions:
//If the user enter the age as :9
//a)age less than 12--print a message “You should have come before
//...3........years”
//If the user enters 70
//b)age greater than 65print a message “You should have come before---5-
//years”
//c)Else enjoy the ride
//You need to calculate the age while printing...


public class AgeEligibalityCriteria {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your Age");
		
		int age = sc.nextInt();
		
		if(age<12) 
		{
			System.out.println("You should  come After :"+(12-age));
		}
		else if(age>65)
		{
			System.out.println("You should have come before :"+(age-65));
		}
		
		

	}

}
