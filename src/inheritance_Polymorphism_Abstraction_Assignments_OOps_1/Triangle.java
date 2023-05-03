package inheritance_Polymorphism_Abstraction_Assignments_OOps_1;

public class Triangle extends Shape
{
	int base, height;
	Triangle(int base, int height)
	{
		this.base = base;
		this.height = height;
	}

	
	void area() 
	{
		System.out.println("Area of rectangle :" +(0.5f*base*height));
		
	}

}
