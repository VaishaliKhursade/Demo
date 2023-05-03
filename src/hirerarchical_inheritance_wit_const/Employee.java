package hirerarchical_inheritance_wit_const;

public class Employee extends Person
{
		int empid;
		long salary;
		
		Employee(String name, int age, int empid, long salary)
		{
			super(name, age);
			this.empid = empid;
			this.salary = salary;
		}
		void display()
		{
			System.out.println(name+" "+age+" "+empid+" "+salary);
		}

}
