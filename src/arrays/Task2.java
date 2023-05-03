package arrays;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("How many Values you want to store");
		int sz = sc.nextInt();            //4
		
		int arr[]= new int[sz];
		System.out.println("Enter the numbers you want to store");
		
		for (int i=0;i<sz;i++) 
		{
			arr [i]=sc.nextInt();
		}
		
		int sum = 0;
		
		System.out.println("Display array and its sum");
		
		for (int i=0;i<sz;i++)
		{
			System.out.println(arr[i]);
			sum= sum+arr[i];                 //sum=0+1=1    sum=1+2= 3 
		}
			
		System.out.println("Sum of array is :"+sum);
		

	}

}
