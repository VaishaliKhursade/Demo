package arrays;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();            
		
		System.out.println("Enter the number of cols:");
		int cols = sc.nextInt(); 
		
        int arr[][] = new int[rows][cols];
		
		System.out.println("Enter: "+(rows*cols)+" values:");
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("Diagonal the array");
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{ 
				if(i==j) 
				{
					System.out.print(arr[i][j]+"");	
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		

	}

}
