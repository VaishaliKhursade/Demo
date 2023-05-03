package classObject_Assignments;
	/*8. Create a class Area to find the area of Rectangle and 
  	Circle by creating area() method . Using
	overloading concept here.*/

public class Area 
{
	void area(int length, int width)
	{
		System.out.println("Area of rectangle  :"+(length*width));
	}
	
	void area (float red)
	{
		System.out.println("Area of Circle  :"+ (3.41f*red*red));
	}

	public static void main(String[] args) 
	{
		Area a = new Area();
		
		a.area(12, 3);
		a.area(3);
		
		

	}

}
