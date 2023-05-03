package basicprograms_Assignment1;

import java.util.Scanner;

//to convert temperature from Fahrenheit to Celsius degree.


public class UnitConversion {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit" );
	    float f = sc.nextFloat();
	    
	    double cel = ((f-32)/1.9);
	    
	    System.out.println("Temperature in Celsius : "+cel );
	    
	    
	}

}
