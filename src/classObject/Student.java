package classObject;
//Initilazing using refrance variables...

public class Student {
	
	int rollno;
	String name;
	
	public static void main(String[] args) 
	{
		Student s = new Student();
				s.rollno= 101;
		        s.name = "John";
		        System.out.println(s.rollno+" "+s.name);

	}

}
