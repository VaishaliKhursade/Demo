package hirerarchical_inheritance;

public class Students extends Person

{
	int rollno,marks;
	void inputStudents()
	{
		System.out.println("Enter the rollno:");	
	    rollno= sc.nextInt();
	    
	    System.out.println("Enter the marks:");	
	    marks= sc.nextInt();
	}
	
	void displayStudents()
	{
		System.out.println(rollno+""+name+""+age+""+marks);
	}
	
	
}

