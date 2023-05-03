package arrays;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) 
	{
		//Ask size from user
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want to print");
		int sz = sc.nextInt();            //10
		
		//Declare an array
		int arr[] = new int[sz];
		System.out.println("Enter the values");
		for(int i=0;i<sz;i++) 
		{
			arr[i]=sc.nextInt();           // arr[0]=10
		}
		//display the array
		
		System.out.println("Print the array");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
			
		}

	}

}
