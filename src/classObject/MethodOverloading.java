package classObject;

public class MethodOverloading
{
	void add(int n1,int n2)
	{
		System.out.println("Sum is:"+(n1+n2));
	}
	

	void add(int n1,int n2,int n3)
	{
		System.out.println("Sum is:"+(n1+n2+n3));
	}
	
	void add(float n1,int n2)
	{
		System.out.println("Sum is:"+(n1+n2));
	}
	
	float add(int n1,float n2)
	{
		return(n1+n2);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.add(3, 4);
		obj.add(3, 6, 6);
		obj.add(7, 8);
		System.out.println("Sum is:"+obj.add(5, 6.5f));
	}

}
