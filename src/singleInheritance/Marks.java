package singleInheritance;

public class Marks extends Student
{
            char grade;
    void inputmarks() 
    {
    	System.out.println("Enter the Grade:");
    	grade = sc.next().charAt(0);
    }
	
	void display() 
	{
		System.out.println(rollno+""+name+""+grade);
	}
	
	
	
	
	
	
	
	
}
