package decisionStatements_Assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No n1 ");
		System.out.println("Enter No n2 ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sum = n1+n2; 
		
		System.out.print(n1+" "+n2);
		
		for(int i=n1;i<10;i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		
		
		

	}

}
