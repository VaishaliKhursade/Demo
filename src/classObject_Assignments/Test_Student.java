package classObject_Assignments;

public class Test_Student {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101, "Reva", 80);
		Student s2 = new Student(101, "Disha", 70);
		Student s3 = new Student(101, "Anaya", 60);
		Student s4 = new Student(101, "Manu", 95);
		Student s5 = new Student(101, "Veda", 90);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		
		if(s1.marks>s2.marks&&s1.marks>s3.marks&&s1.marks>s4.marks&&s1.marks>s5.marks)
		{
			System.out.println("Highst Marks : "+s1.name+" "+s1.marks);
		}
		else if(s2.marks>s1.marks&&s2.marks>s3.marks&&s2.marks>s4.marks&&s2.marks>s5.marks)
		{
			System.out.println("Highst Marks : "+s2.name+" "+s2.marks);
		}
		else if(s3.marks>s1.marks&&s3.marks>s2.marks&&s3.marks>s4.marks&&s3.marks>s5.marks) 
		{
			System.out.println("Highst Marks : "+s3.name+" "+s3.marks);
		}
		else if(s4.marks>s1.marks&&s4.marks>s2.marks&&s4.marks>s3.marks&&s4.marks>s5.marks)
		{
			System.out.println("Highst Marks : "+s4.name+" "+s4.marks);
		}
		else 
		{
			System.out.println("Highst Marks : "+s5.name+" "+s5.marks);
		}
			
	}
	
	
}