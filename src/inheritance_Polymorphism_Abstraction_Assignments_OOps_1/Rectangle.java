package inheritance_Polymorphism_Abstraction_Assignments_OOps_1;

public class Rectangle extends Shape
{
	int length, width;
	
	Rectangle(int length, int width)
	{
		this.length =length;
		this.width = width;
	}
	
	void area() 
	{
		System.out.println("Area of Rectangle :" + (length*width));
		
	}

}
