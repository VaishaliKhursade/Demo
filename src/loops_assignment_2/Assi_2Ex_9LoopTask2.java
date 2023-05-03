package loops_assignment_2;

import java.util.Scanner;

	/*9) Write a program in Java to display the cube of the number 
	 * up to given an
	integer. Also find the sum of cubes.*/


public class Assi_2Ex_9LoopTask2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=limit;i++) 
		{
			System.out.println(i*i*i);
			sum=sum+(i*i*i);
		}
		System.out.println("Sum of cube :"+sum);

	}

}
