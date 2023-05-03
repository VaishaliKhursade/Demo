package exceptionsHandling;

public class Student 
{
	void validmarks(int marks)throws MarksOutOfRange //introduces 
	{
		if(marks>100) 
		{
			throw new MarksOutOfRange("invalid marks");
		}
		else
		{
			System.out.println("Valid Marks");
		}
	}

	
	public static void main(String[] args) 
	{
		Student s = new Student();
		try
		{
			s.validmarks(200);
		}
		catch(MarksOutOfRange e)
		{
			e.printStackTrace();
		}
	}

}
