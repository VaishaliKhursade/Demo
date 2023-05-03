package interfaceTask;

public class Circle extends Diameter implements Circumfarance,Area
{

	
	 float diameter(float radius) 
	{
		return 2*radius;
		
	}

	
	public float area(float radius) 
	{
		return 3.14f*radius*radius;
		
	}

	
	public float circumfarance(float radius) 
	{
		return 3.14f*2*radius;
		
	}

	
	
}
