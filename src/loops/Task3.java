package loops;
/*3)Program to ask number form user
and limit from user...
Print the multiplication table*/

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Limit");
		int limit = sc.nextInt();
		
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		
		for(int i=1;i<=limit;i++) 
		{
			int mul=num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
		

	}

}
