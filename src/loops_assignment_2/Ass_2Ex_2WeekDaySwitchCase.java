package loops_assignment_2;

//2). Write a Java program that keeps a number from the user and generates an
//integer between 1 and 7 and displays the name of the weekday. (use switch case)


import java.util.Scanner;

public class Ass_2Ex_2WeekDaySwitchCase {

	public static void main(String[] args) 
	{
		
		

		System.out.println("First Day of Week   : 1");
		System.out.println("Second Day of Week  : 2");
		System.out.println("Third Day of Week   : 3");
		System.out.println("Fourth Day of Week  : 4");
		System.out.println("Fifth Day of Week   : 5");
		System.out.println("Sixth Day of Week   : 6");
		System.out.println("Seventh Day of Week : 7");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your choice:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
        	System.out.println("Monday");
        break;
		
		case 2:
        	System.out.println("Tuesday");
        break;
		
		case 3:
        	System.out.println("Wednesday");
        break;
        
		case 4:
        	System.out.println("Tursdy");
        break;
        
		case 5:
        	System.out.println("Friday");
        break;
        
		case 6:
        	System.out.println("Satyrday");
        break;
        
		case 7:
        	System.out.println("Sunday");
        break;
        
		default:
			System.out.println("Wrong Choice!!!!!...");	
		    break;
		}
		
		

	}

}
