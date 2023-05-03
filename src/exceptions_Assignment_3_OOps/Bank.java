package exceptions_Assignment_3_OOps;

import java.util.Scanner;

import exceptionsHandling.MarksOutOfRange;

public class Bank 
{
	void minbalance(long balance) throws BalanceWithinRange
	{
		if(balance<10000)
		{
			throw new BalanceWithinRange("Balance is not within the range..please maintain the amount");
		}
		else
		{
			System.out.println("your account balance is maintained");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Balance");
		long bal = sc.nextLong();
		
		Bank b = new Bank();
		
		try
		{
			b.minbalance(bal);
		}
		catch(BalanceWithinRange e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
