package basicprograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		         Scanner sc = new Scanner(System.in);              // new allocates memory
				
				/* System.out.println("Enter Your Name:");
		
		         String name = sc.next();                          //next is the function which allows you to ask values
		
		         System.out.println("Hello your name is:"+name);
		   
		         
		  //Ask age from user and print it.......next Int()
		         
		         System.out.println("Enter Your age:");
		         int age = sc.nextInt();
		         System.out.println("My age is:"+age);
		         
		  //Ask Marks from user and print it.......next Flot
		         
		         System.out.println("Enter Your marks:");
		         int marks = sc.nextInt();
		         System.out.println("My marks is:"+marks);
		         
		  //Ask grade from user and print it.......next(). charAt(0)	
		         
		         System.out.println("Enter Your grade:");
		         char
		         grade = sc.next().charAt(0);
		         System.out.println("My grade is:"+grade);
		         
		  //Assignment Task1
		         
		 //Program to ask three numbers from user and find the product of the numbers
		         
		         System.out.println("Enter the First number:");
		         int num1 = sc.nextInt();
		         
		         System.out.println("Enter the Second number:");
		         int num2 = sc.nextInt();
		         
		         System.out.println("Enter the Third number:");
		         int num3 = sc.nextInt();
		         
		         int Product = (num1*num2*num3);
		         
		         System.out.println("Product of Three number:"+(Product); 
		         
		 //Assignment Task2
		         
		//Program to ask Radius from user and find the Area Circumference and Diameter of circle        
		         
		         System.out.println("Enter the Radius:");
		         int redi=sc.nextInt();
		         
		         float Area = (3.14f*redi*redi);
		         
		         float Circumference = (2*3.14f*redi);
		         
		         float Diameter = (2*redi);
		         
		         System.out.println("Area of circle:"+Area);
		         System.out.println("Circumference of circle:"+Circumference);
		         System.out.println("Diameter of circle:"+Diameter );
		         
		 //Assignment Task 3
		 //   Program to ask the marks of three subject And calculate the average marks
		         
		         System.out.println("Enter the Sub1 marks:");
		         int Sub1 = sc.nextInt();

		         System.out.println("Enter the Sub2 marks:");
		         int Sub2 = sc.nextInt();
		         
		         System.out.println("Enter the Sub3 marks:");
		         int Sub3 = sc.nextInt();
				        
		         int Avg = ((Sub1+Sub2+Sub3)/3);
		         System.out.println("Avg marks in three sub:"+Avg);*/
		         
		         
		         
		 //Assignment Task 3    
		// Program to ask Principal, rate and time and calculate the simple intrest
		       
		         System.out.println("Enter the Principal");
		         int princ = sc.nextInt(); 
		         
		         System.out.println("Enter the Rate");
		         int rate = sc.nextInt();
		         
		         System.out.println("Enter the Time");
		         float time = sc.nextFloat();
		         
		         float SI = (princ*rate*time)/100;
		         
		         System.out.println("simple Interest:"+SI);
		         
		         
		         
		         
		         
		         
	}
	

}
