package arrays_Assignment_2;

import java.util.Scanner;

//4. Write a program to sum diagonal elements of array.

public class Task_4SumOfDiagonalElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no of cols");
		int cols = sc.nextInt();
		
		int arr[][]= new int[rows][cols];
	
		System.out.println("Enter values :"+(rows*cols));
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Display Diagonal Elements of Array");
		
		int sum = 0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]+"  ");
					sum = sum+arr[i][i];
				}
				System.out.print("\t");
			}
			System.out.println();
			
		}
		
		System.out.println("sum of diagonal No :"+sum);
			
			
		
		
		
		

	}

}
