package loops_assignment_2;

import java.util.Scanner;

//3). Write a program to ask a number from user and calculate the factorial .

public class Assi_2Ex_3Factorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();
		int fact = 1;
		
		for(int i=no;i>=1;i--) 
		{
			fact = fact*i;
		}
			System.out.println("Factorial of Given No : " +fact);	

	}

}
