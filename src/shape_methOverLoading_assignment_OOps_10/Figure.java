package shape_methOverLoading_assignment_OOps_10;

	/* 10. Create a package called Shape. Inside this
	package define a class named as Figure, which
	computes the volume of a cube, cylinder and sphere
	using method overloading. Access this class and
	methods from another file*/

public class Figure 
{
	int volume(int side)
	{
		return side*side*side;
	}
	
	void volume(int red, int height)
	{
		System.out.println("Volume Of Cylinder : " +(3.14*red*red*height));
	}

	float volume(float red)
	{
		return ((4/3)*3.14f*red*red*red);
	}
}
