package classObject_Assignments;

/*2. Create Bank class with fields account_no, name and amount .Create the following methods:
Make it menu Driven Program using switch
a) Create a parameterized constructor
b) deposit()
c) withdraw()
d) checkBalance()
e) displayDetails()
Test the Account class in another class.*/

import java.util.Scanner;

public class Bank 
{
	int acc_no;
	String name;
	int amount;
	
	Scanner sc = new Scanner(System.in);
	
	Bank(int acc_no,String name, int amount)
	{
		this.acc_no = acc_no;
		this.name = name;
		this. amount = amount;
	}
	
	void display()
	{
		 System.out.println("The account number is : " +acc_no);
		 System.out.println("Your name is : " +name);
		 System.out.println("The amount in your account : "+amount);
	}
	
	void deposit()
	{
		int amt;
		System.out.println("Enter the amount you want to deposit : ");
		amt = sc.nextInt();
		amount = amount + amt;
		System.out.println("After deposit Account balance : "+amount);
	}
	
	public void withdraw()
	{
		int amt;
		System.out.println("Enter the amount you want to withdraw : ");
		amt = sc.nextInt();
		
		if(amount>=amt)
		{
			amount = amount - amt;
			System.out.println("Balance after withdrawal : "+amount);
		}
		else 
		{
			System.err.println("Transaction failed, Your balance is less than "+ amt);
		}
	}
	
	void getbalance()
	{
		System.out.println("Balance of your account is : "+amount);
	}

}
