package classObject_Assignments;

/*1. Create a Circle class with fields radius as float Initialize the radius through method .Also create
separate method to calculate Area and Circumference of a Circle . Create another class as Circle
and call the respective methods.*/

public class Circle
{
	float radius;
	
	float radius()
	{
		return radius;
	}
	
	void area(float radius)
	{
		float area = 3.14f*radius*radius;
		
		System.out.println("Area Of Circle : "+area);
	}
	
	void circum(float radius)
	{
		float circum = 2*3.14f*radius;
		System.out.println("Circumfarance Of Circle : "+circum);
	}
	
	

}
