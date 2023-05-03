package classObject_Assignments;

/*3. Create Student class and parameterized constructor with attributes rollNo , name and marks.
Write a method to display the details of 5 students. Also create a Test Student class to create
objects and find the highest marks using reference variable.*/

public class Student 
{
	int rollno;
	String name;
	int marks;
	
	Student(int rollno, String name, int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this. marks = marks;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+marks);
	}
}
