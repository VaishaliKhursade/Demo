package arrays_Assignment_2;
	/*2. Write a program to ask the size form the user and find the 
	smallest and largest element in an array.*/


import java.util.Scanner;

public class Task_2Userinput_Array {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you want to enter");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Elements you want to store: ");
		
		
		for(int i=0;i<size;i++) 
		{
			arr[i] = sc.nextInt();
		}
		

		System.out.println("Display Array");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		for(int i=1;i<size;i++)
		{
			if (arr[i]<min)
			{
				min = arr[i];
			
			}
			
		}
		System.out.println("Min no is :"+min);
		
		
		int max = arr[0];
		for(int i=1;i<size;i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			
			}
			
		}
		System.out.println("Max no is :"+max);
		
	}

}
