package basicprograms_Assignment1;

//WAP to find the area and perimeter of Rectangle .

public class AreaPerimeterCalculations {

	public static void main(String[] args) 
	{
		int len = 20;
		int width = 10;
		
		int Area = (len*width);
		int Peri = ((2*len)+(2*width));
		
		System.out.println("Area of Rectangle : " +Area);
		System.out.println("Perimeter of Rectangle : " +Peri);

	}

}
