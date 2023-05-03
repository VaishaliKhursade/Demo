package methOveridding_Assignment_OOps_3;

public class HR extends Employee
{
	int noOfRecruitments;
	
	HR(int empid, String name, long salary, int noOfRecruitments )
	{
		super(empid,name,salary);
		this.noOfRecruitments = noOfRecruitments;
	}
	
	void display(int empid, String name, long salary, int noOfRecruitments)
	{
		System.out.println(empid+"   "+name+"   "+salary+"   "+noOfRecruitments);
	}
	
	int incentives;
	
	long totalSalary( long salary, int incentives, int noOfRecruitments  )
	{
		return noOfRecruitments*(salary+incentives);
		
	}

}
