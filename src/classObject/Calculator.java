package classObject;

public class Calculator {

	void add(int n1, int n2) 
	{
		System.out.println("sum is :"+(n1+n2));
	}
	
	float div (float n1, float n2) 
	{
		return n1/n2;
	}
	//Write a method to return the product of two numbers for int
	
	int product(int n1, int n2) 
	{
		return n1*n2;
	}
	
	//Write a method to return the Subtraction of two numbers for int
	
	int Subtraction(int n1, int n2)
	{
		return n1-n2;
	}
	
	//Write a method to return the add of two Strings with return type String
	
	String Addition(String s1, String s2) 
	{
		return s1+s2;
	}
	
	
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		c.add(2, 4);
		System.out.println("Div is :"+c.div(8.4f,2.2f));
		
		System.out.println("Product of two Number :"+c.product(4,3));
		
		System.out.println("Subtraction of two Number :"+c.Subtraction(9, 3));
		
		System.out.println("Add Strings :"+c.Addition("vaishali", "Arnav"));
		
		
	}

	
	
	
	
}
