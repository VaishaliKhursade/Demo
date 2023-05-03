package hirerarchical_inheritance;

public class Test {

	public static void main(String[] args)
	{
		Students s = new Students();
		s.inputStudents();
		s.inputPerson();
		s.displayStudents();
		
		Employee e =new Employee();
		e.inputPerson();
		e.inputEmployee();
		e.displayEmployee();

	}

}
