
package loops_assignment_2;

import java.util.Scanner;

//Write a program to ask the limit from user and find the sum of even numbers.
public class Assi_2Ex_5SumOfEavenNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit");
		int no = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=no;i++) 
		{
			if(i%2==0) 
			{
				sum = sum+i;	
			}
			
		}
		  System.out.println("Sum of all eaven Numbers : " +sum);
	}

}
