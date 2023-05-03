package decisionStatements;

import java.util.Scanner;

public class Calculater_switch {

	public static void main(String[] args)
	{
		System.out.println("+ ADD");
		System.out.println("- SUB");
		System.out.println("* Mul");
		System.out.println("/ DIV");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number:");
		int num1 = sc.nextInt();
				
		System.out.println("Enter Second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Your choice:");
		char choice = sc.next().charAt(0);
		
		switch(choice) 
		{
		case '+':
			int sum=num1+num2;
			System.out.println("Sum is :"+ sum);
			break;
			
		case '-':
			int sub=num1-num2;
			System.out.println("Sub is :"+ sub);
			break;	
			
		case '*':
			int mul=num1*num2;
			System.out.println("Mul is :"+ mul);
			break;
			
		case '/':
			int Div=num1/num2;
			System.out.println("Div is :"+ Div);
			break;
			
			default:
				System.out.println("Wrong Choice!!!!!...");	
			    break;
			
			
			
			
		}
	}

}
