package arrays_Assignment_2;

import java.util.Scanner;

/*Write a program to find the number of even and odd integers 
	in a given array of integers.*/

public class Task_3EavenOddArrey {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many no of numbers you want to enter");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Numbers you want to store");
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Display Array : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			
			if (arr[i]%2==0)
			{
				System.out.println(" Eaven integers : " +arr[i]);
			}
		
		}
		
		for(int i=0;i<size;i++)
		{
			
			if (arr[i]%2!=0)
			{
				System.out.println(" Odd integers : " +arr[i]);
			}
		}
	}

}
