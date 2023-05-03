package classObject;

public class Shape
{
      int area( int side) 
     {
	    return(side*side);
     }
	
	void area(int length, int width) 
	{
		System.out.println("Area of Rectangle :"+ (length*width));
	}
	
	float area( float radius) 
	{
		return (3.14f*radius*radius);
	}
	
	public static void main(String[] args)
	{
	Shape a = new Shape();
	a.area(3, 5);
	System.out.println("Area of Square :"+a.area(10));
	System.out.println("Area of Circle:"+a.area(3.5f));
	
	
	
	
	}
	
	
	
	
}
