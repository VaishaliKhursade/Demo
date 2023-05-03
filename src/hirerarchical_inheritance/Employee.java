package hirerarchical_inheritance;

public class Employee extends Person
{
	int empid,salary;
	 
	void inputEmployee()
	{

		System.out.println("Enter the empid:");	
	    empid= sc.nextInt();
	    System.out.println("Enter the salary:");	
	    salary= sc.nextInt();
	}

	void displayEmployee()
	{
		System.out.println(age+" "+name+" "+empid+" "+salary);
	}



}
