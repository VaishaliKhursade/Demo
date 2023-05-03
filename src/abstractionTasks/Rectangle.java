package abstractionTasks;

import java.util.Scanner;

public class Rectangle extends Shape
{
	int length,breadth;
	
	Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length");
		System.out.println("Enter the Breadth");
		 length = sc.nextInt();
		 breadth = sc.nextInt();
	}
	
	void area()
	{
		System.out.println("Area of Rectangle :" + (length*breadth));
	}
	
	void peri()
	{
		System.out.println("Perimeter of Rectangle :" +( 2*(length+breadth)));
	}

}
