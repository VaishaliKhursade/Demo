package basicprograms_Assignment1;

import java.util.Scanner;

//WAP to take the marks of three subject from user and calculate the average.


public class AvgCalculationInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter Sub 1 Marks");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter Sub 2 Marks");
		int sub2 = sc.nextInt();
		
		
		System.out.println("Enter Sub 3 Marks");
		int sub3 = sc.nextInt();
		
		
		int avg = ((sub1+sub2+sub3)/3);
		System.out.println("Average Marks in three Sub: "+avg);

	}

}
