package abstraction_Assignment_1_OOps;

import java.util.Scanner;

public class KotMBank extends GeneralBank
{
	
	int savintrate = 4;
	float fixintrate = 8.5f ;
	
	KotMBank()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Saving Amount");
		int amount = sc.nextInt();

	}
	
	
	void getSavingInterestRate() 
	{
		System.out.println("Saving interest Rate for KM Bank in %:"  +savintrate);
		
	}

	
	void getFixedInterestRate() 
	{
		System.out.println("Fixed interest Rate for KM Bank in %:"   +fixintrate);
		
	}

}
