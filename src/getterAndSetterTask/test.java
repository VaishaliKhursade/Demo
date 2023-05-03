package getterAndSetterTask;

public class test {

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.setEmpid(99);
		System.out.println(e.getEmpid());
		
		e.setName("john");
		System.out.println(e.getname());
	}

}
