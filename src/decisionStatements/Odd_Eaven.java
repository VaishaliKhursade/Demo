package decisionStatements;

import java.util.Scanner;

public class Odd_Eaven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num = sc.nextInt();
		
		if (num % 2 ==0) 
		{
			System.out.println(num+ "Number is eaven");
		}
		else 
		{
			System.out.println(num+ "Given Number is odd");
		}

	}

}
