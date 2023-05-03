package loops;

	/*2)Program  to ask limit from user
	and print the sqaures till the given 
	limit ..Also find the sum of squares.
	[Use for loops]*/

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Limit");
		
		int limit = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=limit;i++)
		{ 
			int sq=i*i;              //1*1= 1....2*2= 4
			System.out.println(sq);
			sum=sum+sq;             //sum=0+1=1...sum=1+4=5...sum=5+9=5
			
		}
		
		System.out.println("sum of squares:"+sum);
		
		
		
		

	}

}
