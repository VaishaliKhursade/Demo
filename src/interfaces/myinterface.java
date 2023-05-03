package interfaces;

public interface myinterface 
{
	int a = 10;
	
	void msg();
	
	int add(int n1,int n2);
	
	default void display()
	{
		System.out.println("Hello default methods...."+a);
	}
	static void printmsg()
	{
		System.out.println("Hello static methods...."+a);
	}
}
