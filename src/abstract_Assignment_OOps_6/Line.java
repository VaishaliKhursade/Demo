package abstract_Assignment_OOps_6;
import static java.lang.Math.sqrt;

public class Line extends Shape
{
	int x1, y1, x2, y2;
	
	Line(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	void calcArea() 
	{
		
		System.out.println("Area of Line :" + (sqrt(((x1-x2)^2) +((y1-y2)^2))));	
	}

}
