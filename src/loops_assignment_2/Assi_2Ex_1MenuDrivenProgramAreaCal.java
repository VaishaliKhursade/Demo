package loops_assignment_2;

/*1) Write a program to calculate area of Rectangle, area of Triangle and area of
Circle using switch statement. Make it a menu driven program..
Formulaes:-Area Of rectangle=length*breadth
Area of triangle=1/2*base*height
Area of Circle=3.14*radius*radius*/

import java.util.Scanner;

public class Assi_2Ex_1MenuDrivenProgramAreaCal {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" For Area of Circle Enter = C");
        System.out.println(" Enter Redius of circle :");
        int redi = sc.nextInt();
        
        System.out.println("For Area of Rectangle Enter = R");
        System.out.println("Enter Length of Rectangle:");
        System.out.println("Enter width of Rectangle:");
        int len = sc.nextInt();
        int wid = sc.nextInt();
       
        System.out.println("For Area of Square Enter = S");
        System.out.println(" Enter side of Square:");
        int side = sc.nextInt();
        
        System.out.println("Enter Your choice:");
		char choice = sc.next().charAt(0);
        
        switch(choice) 
        {
        case 'C':
        	float areaOfCir = (3.14f*redi*redi);
        System.out.println("Area of Circle :"+areaOfCir);
        break;
        
        case 'R':
        	int areaOfRect = (len*wid);
        System.out.println("Area of Rectangle :"+areaOfRect);
        break;
        
        case 'S':
        	int areaOfSqu = (side*side);
        System.out.println("Area of Rectangle :"+areaOfSqu);
        break;
        
        default:
			System.out.println("Wrong Choice!!!!!...");	
		    break;
        
        
        
        
        
        
        }
        
	}

}
