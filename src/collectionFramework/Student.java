package collectionFramework;

public class Student 
{
	int rollno;
	String name;
	Student(int rollno, String name)
	{
		this.rollno= rollno;
		this.name = name;
			
	}

//toString():--a method which belongs to object class and used to print the objects
		
		public String toString()
		{
			return rollno+" "+name;
		}

}
