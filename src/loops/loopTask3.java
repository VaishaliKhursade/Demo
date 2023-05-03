package loops;

import java.util.Scanner;

//Program to ask number form user
//and limit from user...
//Print the multiplication table

//Enter the number:5
//Enter the limit:10

public class loopTask3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println("Enter limit");
		int limit = sc.nextInt();
		
		for(int i=1;i<=limit;i++) 
		{
			int mul = num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
		

	}

}
