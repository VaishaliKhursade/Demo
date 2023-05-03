package staticKeyword;

public class Student 
{
	int rollno;
	String name;
	static String clgName="ITS";
	
	Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	static void changename() 
	{
		clgName = clgName+"123";
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+"  "+clgName);
	}

}
