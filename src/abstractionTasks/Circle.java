package abstractionTasks;

import java.util.Scanner;

public class Circle extends Shape

{
	float radius;
	final float pi = 3.14f;
	
	Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius  = sc.nextFloat();
	}
	
	void area()
	{
		System.out.println("Area of Circle :" + (3.14f*radius*radius));
	}
	

	void peri()
	{
		System.out.println("Perimeter of Circle :" + (2*3.14f*radius));
	}
	
	

}
