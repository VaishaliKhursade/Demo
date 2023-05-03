package getterAndSetterTask;
//Check the empId should be great than 100
public class Employee 
{
	private int empid;
	private String name;
	
	//Setter....write logic..
	//Getters ....print/get result
	
	public void setEmpid(int empid)
	{
		if(empid<100)
		{
			this.empid = empid;
		}
	}
	
	public int getEmpid()
	{
		return empid;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public String getname() 
	{
		return name;
	}
}
