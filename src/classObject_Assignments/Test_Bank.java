package classObject_Assignments;

import java.util.Scanner;

public class Test_Bank {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number : ");
		int acc = sc.nextInt();
		
		System.out.println("Enter the name : ");
		String n = sc.next();
		
		System.out.println("Enter the amount : ");
		int bal = sc.nextInt();
		
		
		Bank b = new Bank(acc,n,bal);
		
		do {
			System.out.println("Welcome to banking Application");
			System.out.println("Choose 1 to disply details of your account");
			System.out.println("Choose 2 to deposit amount");
			System.out.println("Choose 3 to withdraw amount");
			System.out.println("Choose 4 to check Balance");
			System.out.println("Choose 5 to Exit");
			
			System.out.println("Enter the Choice");
			int ch = sc.nextInt();
			
			switch (ch) 
			{
			case 1:
				b.display();
				break;
			case 2:
				b.deposit();;
				break;
			case 3:
				b.withdraw();;
				break;
			case 4:
				b.getbalance();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Wrong Choice");
				
			}
			
			
			
			
		}while (true);
		
		
		
	}

}
