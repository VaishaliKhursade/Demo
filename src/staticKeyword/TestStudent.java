package staticKeyword;

public class TestStudent {

	public static void main(String[] args) 
	{
		Student s1 = new Student(11,"JOHN");
		Student s2 = new Student(12,"Juli");
		Student s3 = new Student(13,"Mery");
		
		Student.changename();
		
		s1.display();
		s2.display();
		s3.display();
	}

}
