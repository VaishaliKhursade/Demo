package loops_assignment_2;

import java.util.Scanner;

/*7) Write a program that reads an positive integer and 
	count the number of digits the number.*/

public class Assi_2Ex_7CountNoOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		String size = Integer.toString(n);
		
		System.out.println("Number of Digits : "+size.length());
		
	}

}
