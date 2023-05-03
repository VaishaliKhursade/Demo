package decisionStatements;

import java.util.Scanner;

public class VotarEligibility {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		
		int age = sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Welcome For Voting");
		}
		else 
		{
			System.out.println("Not Eligible For Voting");
		}
		

	}

}
