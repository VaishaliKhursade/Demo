package basicprograms;

import java.util.Scanner;

//WAP to take the marks of three subject from user and calculate the average.


public class AvgMarks 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sub1 marks:");
		int sub1 = sc.nextInt();
		
		
		System.out.println("Enter the sub2 marks:");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter the sub3 marks:");
		int sub3 = sc.nextInt();
		
		int Avg = (sub1+sub2+sub3)/3;
		System.out.println("Avg Marks of Three Sub :" +Avg);
		
		
		
		
	}

}
