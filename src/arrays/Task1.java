package arrays;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.println("How many Fruits you want to store");
				int sz = sc.nextInt();            //4
				
				String fruits[]= new String[sz];
				System.out.println("Enter the Fruits you want to store");
				
				for (int i=0;i<sz;i++) 
				{
					fruits [i]=sc.next();
				}
				
				System.out.println("Print the array:");
				
				for (int i=0;i<sz;i++)
				{
					System.out.println(fruits[i]);
				}
				
				

	}

}
