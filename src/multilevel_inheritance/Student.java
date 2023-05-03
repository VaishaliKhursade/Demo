package multilevel_inheritance;

import java.util.Scanner;

public class Student 
{
  int rollno;
  String name;
 
  Scanner sc = new Scanner(System.in);
  
  void inputStudents()
  {
	    System.out.println("Enter the rollno:");
		rollno = sc.nextInt();
  
		System.out.println("Enter the name:");	
        name = sc.next();
  }
	
	
	
}
