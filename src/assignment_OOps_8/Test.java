package assignment_OOps_8;

public class Test {

	public static void main(String[] args) 
	{
		Addition ad = new Addition();
		System.out.println("Addition of two integers : "+ ad.add(10,20));

		System.out.println("Subtraction of two Floats : "+ ad.subtract(30.2f, 20.40f));
		
		Maximum m = new Maximum();
		m.max();
	}

}
