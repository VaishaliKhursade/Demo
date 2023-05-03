package shape_methOverLoading_assignment_OOps_10;

public class Test {

	public static void main(String[] args) 
	{
		Figure f = new Figure();
		
		System.out.println("Volume of Cube : " +f.volume(3));
		
		f.volume(3, 12);
		
		System.out.println("Volume of Sphere : "+ f.volume(1.2f));

	}

}
