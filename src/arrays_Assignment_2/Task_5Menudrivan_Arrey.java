package arrays_Assignment_2;

import java.util.Scanner;

/*5. Write a menu driven program to a)Add two matrices 
	b) Subtract two matrices c)multiply two matrices..*/

public class Task_5Menudrivan_Arrey {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		
	System.out.println("Enter the no of cols");
		int cols = sc.nextInt();
		
		int mat1[][]= new int[rows][cols];
		int mat2[][]= new int[rows][cols];
		
	System.out.println("Enter the first matrix element :");
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		
	System.out.println("Enter the second matrix element :");
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		
	System.out.println("First Matrix :");
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		
	System.out.println("Second Matrix :");
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		
	System.out.println("Which operation you want to perform on matrix");
		
	 	System.out.println("1.Addition");
	 	System.out.println("2.Subtraction");
	 	System.out.println("3.Multiplication");
	 	
	 	System.out.println("Enter your choice");
	 	int choice = sc.nextInt();
	 	
	 	switch (choice)
	 	{
	 	case 1:
	 	System.out.println("Addition of two matrix is :");
	 	
	 	int add[][] = new int[rows][cols];
	 	for(int i=0;i<rows;i++)
	 	{
	 		for(int j=0;j<cols;j++)
	 		{
	 			add[i][j] = mat1[i][j]+mat2[i][j];
	 			System.out.print(add[i][j] + "\t");
	 		}
	 		System.out.println();
	 	}
	 	break;
	 	
	 	case 2:
		 	System.out.println("Subtraction of two matrix is :");
		 	
		 	int sub[][] = new int[rows][cols];
		 	for(int i=0;i<rows;i++)
		 	{
		 		for(int j=0;j<cols;j++)
		 		{
		 			sub[i][j] = mat1[i][j]-mat2[i][j];
		 			System.out.print(sub[i][j] + "\t");
		 		}
		 		System.out.println();
		 	}
		 	break;
	 	
	 	case 3:
		 	System.out.println("multiplication of two matrix is :");
		 	
		 	int mul[][] = new int[rows][cols];
		 	for(int i=0;i<rows;i++)
		 	{
		 		for(int j=0;j<cols;j++)
		 		{
		 			mul[i][j] = mat1[i][j]* mat2[i][j];
		 			System.out.print(mul[i][j] + "\t");
		 		}
		 		System.out.println();
		 	}
		 	break;
		 	
	 	default:
			System.out.println("Wrong Choice!!!!!...");	
		    break;
	 	
	 	}
	 	
	 	
	}

}
