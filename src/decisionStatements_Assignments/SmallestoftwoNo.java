package decisionStatements_Assignments;

//Find the smallest of two numbers .Take numbers from user

import java.util.Scanner;

public class SmallestoftwoNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1");
		int num1 = sc.nextInt();
		

		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();

		if (num1>num2)
		{
			System.out.println("Smallest Number : " +num2);
		}
		else
		{
			System.out.println("Smallest Number : " +num1);
		}
		
		
		
	}
	
	

}
