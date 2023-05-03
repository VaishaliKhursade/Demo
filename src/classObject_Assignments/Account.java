package classObject_Assignments;

import java.util.Scanner;

public class Account 
{
	
	String accno;
	String name;
	long amount;
	long balance;
	
	Account(String acc_no,String name, long amount, long balance)
	{
		this.accno = accno;
		this.name = name;
		this. amount = amount;
		this.balance = balance;
	}

//Method to display account details
	
	public void showAccount(String accno,String name, long balance)
		{
		System.out.println( "Account Details");
		}	
		
//Method to display deposit
		
	public void deposit(long amount)
		{
			balance = balance+amount;
			System.out.println();
		}
		
		
//Method to withdraw money
		
	public void withdraw(long amount)
		{
			if (balance>=amount)
			{
				balance = balance-amount;
				System.out.println("Available Balance is :"+balance);
			}
			else
			{
				System.out.println("Available Balance is less than" + amount +"\tTransaction failed...!!" );
			}
		}
		
		
//Method to check balance
		
	public void balancecheck(long amount)
		{
			System.out.println("Your available balance is : "+ balance);
			
		}
		
		
	}
	

