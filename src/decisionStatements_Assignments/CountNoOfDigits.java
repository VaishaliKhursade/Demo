package decisionStatements_Assignments;

import java.util.Scanner;

public class CountNoOfDigits 
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num =sc.nextInt();
		
		int count = 0;
		
		
		while(num>0)
		{
			num = (num/10);
			count++;
		}
		
		System.out.println("No of Digits : "+count);

	}

}
