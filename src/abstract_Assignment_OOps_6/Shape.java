package abstract_Assignment_OOps_6;

	/* 6. Write the following classes
	Create an abstract class Shape which has abstract
	method void calcArea() and non-abstract method
	void display() which print the area
	Create two interfaces Drawable has void draw()
	and Fillable has void fill() methods
	Create class Circle and Line which has parameterized
	constructor and should implement all abstract
	method respectively.
	Hint:-area of circle 3.14* r*r
	Area of line: sqrt(((x1-x2)^2) +((y1-y2)^2)); //use
	import static java.lang.Math.sqrt
	For void fill() and void draw print a message only*/

public abstract class Shape 
{
	abstract void calcArea();
	
	
	void display()
	{
		System.out.println("area of circle");
		System.out.println("area of line");
	}
	
	
	
	
}
