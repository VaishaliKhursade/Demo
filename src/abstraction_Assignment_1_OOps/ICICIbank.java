package abstraction_Assignment_1_OOps;

import java.util.Scanner;

public class ICICIbank extends GeneralBank
{
	int savintrate = 6;
	int fixintrate = 9;
	
	ICICIbank()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Saving Amount");
		int amount = sc.nextInt();
	}
	
	
	void getSavingInterestRate() 
	{
		System.out.println("Saving interest Rate For ICICI Bank in % :  "+savintrate);
		
	}

	
	void getFixedInterestRate() 
	{
		System.out.println("Fixed interest Rate For ICICI Bank in %:"     +fixintrate);
		
	}

}
