package classObject;

import java.util.Scanner;

public class Person {

	String name, city;
		int age;
		
	Scanner sc = new Scanner(System.in);
	void inputPerson()
	{
		System.out.println("Enter the name of Person");
		 name = sc.next();
		System.out.println("Enter the City of Person");
		 city = sc.next();
		System.out.println("Enter the Age of Person");
	     age = sc.nextInt();
		
	}
	void display() 
	{
		System.out.println(name+" "+age+" "+city);
	}
	
	
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.inputPerson();
		p1.display();
		
		Person p2 = new Person();
		p2.inputPerson();
		p2.display();
	}

}
