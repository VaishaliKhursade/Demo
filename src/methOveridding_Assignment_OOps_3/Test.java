package methOveridding_Assignment_OOps_3;

public class Test 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(10,"Arnav",300000);
		e.display(10,"Arnav",300000);
		System.out.println("Total Salary Of Employee :"+ e.totalSalary(3000, 300000));
		
		System.out.println("-------------------------------");
		
		HR h = new HR(11,"Tanmay",310000,3);
		h.display(11,"Tanmay",310000,3);
		System.out.println("Total Salary Of HR :"+ h.totalSalary(310000, 3100));
		
		System.out.println("-------------------------------");
		
		Manager m = new Manager(12," Vaishaali",250000,9);
		m.display(12," Vaishaali",250000,9);
		System.out.println("Total Salary Of Manager : " + m.totalSalary(210000, 2100, 9));
		
		
		
		
	}

}
