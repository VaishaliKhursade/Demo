package methOveridding_Assignment_OOps_3;

public class Manager extends Employee
{
	int noOfProject;
	
	Manager(int empid, String name, long salary,int noOfProject)
	{
		super(empid,name,salary);
		this.noOfProject = noOfProject;
	}
	
	
	void display(int empid, String name, long salary, int noOfProject )
	{
		System.out.println(empid+"   "+name+"   "+salary+"   "+noOfProject);
	}
	
	
	int bonus ;
	
	long totalSalary( long salary, int bonus, int noOfProject)
	{
		return noOfProject*(bonus+salary);
		
	}
}
