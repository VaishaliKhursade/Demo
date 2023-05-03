package decisionStatements;

import java.util.Scanner;

public class Colors {

	public static void main(String[] args)
	{
		System.out.println("1.RED");
		System.out.println("2.GREEN");
		System.out.println("3.BLUE");
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your choice:");
		int choice = sc.nextInt();
	//	char choice = sc.next().charAt(0)
	//	String choice = sc.next();
		
		switch(choice) 
		{
		case 1:
			System.out.println("Your Colour is red:");	
		    break;
		case 2:
			System.out.println("Your Colour is Green:");	
		    break;
		case 3:
			System.out.println("Your Colour is Blue:");	
		    break;
		default:
			System.out.println("Wrong Choice!!!!!...");	
		    break;
		}
		
	}

}
