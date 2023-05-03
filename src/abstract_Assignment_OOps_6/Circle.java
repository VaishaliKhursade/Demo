package abstract_Assignment_OOps_6;

public class Circle extends Shape 
{
	float radius;
	final float pi = 3.14f;
	
	Circle(float radius)
	{
		this.radius = radius;
		
	}
	
	
	
	void calcArea() 
	{
		System.out.println("Area of Circle :" + (3.14f*radius*radius));
		
	}

}

	
	
