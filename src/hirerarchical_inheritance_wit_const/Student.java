package hirerarchical_inheritance_wit_const;

public class Student extends Person
{
	int rollno;
	int marks;
	
	Student(String name, int age, int rollno, int marks)
	{
		super(name,age);
		this.rollno = rollno;
		this.marks = marks;
	}
	
	void display() 
	{
		System.out.println(name+" "+age+" "+rollno+""+marks);
	}
}
