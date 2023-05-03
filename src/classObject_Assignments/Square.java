package classObject_Assignments;

	/*4. Create a Square class with field side also
    create a parameterized constructor .Write a method	 
	to find the area of a square(use return type as int). 
	Test the class in Test Square Class*/


public class Square 
{
	int side;
	
	Square(int side)
	{
		this.side = side;
	}
	
	int area(int side)
	{
		 int area = side*side;
		 return area;
		
	}
	
}
