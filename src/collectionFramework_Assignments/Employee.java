package collectionFramework_Assignments;

public class Employee 
{
	int empid;
	String name;
	int salary;
	
	Employee(int empid,String name,int salary)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		
	}
	
	public String toString()
	{
		return empid+" "+ name+" "+salary;
		
	}
	
	
	
	
}
