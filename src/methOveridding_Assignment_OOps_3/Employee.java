package methOveridding_Assignment_OOps_3;
	/*2. Create an Employee class which has two subclass HR
	and Manager.
	Employee class
	-An employee class should have data member
	empId, name and salary
	-A method to display employee details.
	-A method to calculate employee salary with
	allowance (Take allowance as argument)
	Manager class
	-A manager class will have noOfProjects as a
	data member
	-Inherit the employee class constructor
	-Override the method for calculating salary
	with bonus based on number of Projects take
	bonus as an argument
	
	HR class
	
	-A manager class will have noOfRecruitments
	as a data member
	-Inherit the employee class constructor
	-Override the method for calculating salary
	with incentives based on number of
	recruitments take bonus as an argument
	Create a Test class and create the objects call the
	respective methods*/


public class Employee 
{
	int empid;
	String name;
	long salary;
	
	Employee (int empid, String name, long salary)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	void display(int empid, String name, long salary )
	{
		System.out.println(empid+"   "+name+"   "+salary);
	}
	
	int allowance ;
	
	long totalSalary(int allowance, long salary)
	{
		return allowance+salary;
	}

}
