package basicprograms_Assignment1;

import java.util.Scanner;

//WAP to find calculate the simple Interest take values form user for
//rate,time and principal.




public class SimpleInterestCalculation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rate Of Interest");
		int rate = sc.nextInt();
		
		System.out.println("Enter duration");
		int duration = sc.nextInt();
		
		System.out.println("Enter the Principal");
		long principal = sc.nextLong();
		
		long si = ((rate*duration*principal)- principal);
		
		System.out.println("Simple interest:"+si);

	}

}
