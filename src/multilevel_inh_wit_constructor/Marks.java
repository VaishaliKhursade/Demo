package multilevel_inh_wit_constructor;

public class Marks extends Student
{
	char grade;
	
	Marks(int rollno,String name,char grade)
	{
	super (rollno,name);
	this.grade = grade;
	}
	void display() 
	{
		System.out.println(rollno+" "+name+" "+grade);
	}
	
}
