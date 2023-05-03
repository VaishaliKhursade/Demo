package loops;

/*1)Program to ask limit from user 
and print even numbers...till the 
limit.. [while and for loops]*/

import java.util.Scanner;

public class Task1WhileAndFor {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Limit");
		
		int limit = sc.nextInt();
		
		//Using while loop
		System.out.println("---Using for while loop--");
		int i=2;
		
		while(i<=limit)
		{
			System.out.println(i);
			 i+=2;                            //i=i+1........i=2+2=4
		}

		
		System.out.println("---Using for for loop--");
		
		for(int j=2;j<=limit;j+=2)
		{
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
	}

}
