package decisionStatements_Assignments;

import java.util.Scanner;

//Find whether a number is negative positive or zero

public class FindPositiveNegative {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
        int num = sc.nextInt();
        
        if (num>0) 
        {
        	System.out.println("Given Number is : Positive");
        }
        else if(num<0) 
        {
        	System.out.println("Given Number is : Negative");
        }
        else 
        {
        	System.out.println("Given Number is : Zero");
        }
        
        
        
        
        
        
	}

}
