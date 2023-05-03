package getter_setter_Assignment_OOps_9;

	/* 9. Create an Employee class with private attributes
	empId , eName and age.
	Access the private data using getters and setters.
	Check the empId should be great than 100*/

public class Employee 
{
	private int empid ;
	private String ename;
	
	public void setEmpid(int empid)
	{
		if (empid>100)
		{
			this.empid = empid;
		}
	}
	public int getEmpid()
	{
		return empid;
	}
	
	
	public void setName(String ename)
	{
		this.ename = ename;
	}
	
	public String getName()
	{
		return ename;
	}
	
	
}
