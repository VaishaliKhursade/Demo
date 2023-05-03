package loops_assignment_2;

import java.util.Scanner;

public class Assi2_Ex_6Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int no = num;
		int temp=no;
		int rev = 0,rem;
		while(temp!=0) 
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev) 
		{
			System.out.println(no + " : is palindrom number");
		}
		else 
		{
			System.out.println(no + " : is not palindrom number");
		}

	}

}
