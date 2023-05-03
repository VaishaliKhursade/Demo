package hirerarchical_inheritance;

import java.util.Scanner;

public class Person

{
	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	
	void inputPerson()
	{
	System.out.println("Enter the name:");	
    name = sc.next();
    
    System.out.println("Enter the age:");	
    age = sc.nextInt();
	}

	
	
}
