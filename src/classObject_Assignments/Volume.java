package classObject_Assignments;

	/*7. Create a class Volume to find the volume of 
	 cylinder and volume of cube using by creating vol()
	methods respectively.Using overloading concept here.*/

public class Volume 

{
	int redius;
	int height;
	int side;
	
	float vol(int redius, int height)
	{
		float vol = 3.14f*redius*redius*height;
		return vol;	
	}
	
	int vol(int side)
	{
		int vol = side*side*side;
		return vol;
	}
	
	
	public static void main(String[] args)
	{
		Volume v = new Volume();
		
		System.out.println("Volume of cylinder : "+v.vol(9, 10));
		System.out.println("Volume of cube : "+v.vol(3));
	}

}
