package classObject_Assignments;

/*6. Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/

public class Addition 
{
	int a ;
	int b ;
	double y ;
	double z ;
	String s1 = "Welcome";
	String s2 = "Home";
	
	
	int add(int a, int b) 
	{
		int add = a+b;
		return add;
	}
	
	double add (double y, double z)
	{
		double add = y+z;
		return add;
	}
	String add(String s1, String S2) 
	{
		String add = s1+s2;
		return add;
	}
	
	public static void main(String[] args) 
	{
		Addition obj = new Addition();
		
		System.out.println("Addition of two integers : " +obj.add(30, 21));
		System.out.println("Addition of two desimals : " +obj.add(12.9, 63.3));
		System.out.println("Addition of two Strings  : " +obj.add("Welcome", "Home"));
	}

}
