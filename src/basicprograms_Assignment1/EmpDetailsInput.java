package basicprograms_Assignment1;

import java.util.Scanner;

//WAP to print the details of employee As empId name and salary by
//taking input from the user.


public class EmpDetailsInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name = sc.next();
		
		System.out.println("Enter Employee Salary");
		long salary = sc.nextLong();
		
		sc.close();
		
		
	}

}
