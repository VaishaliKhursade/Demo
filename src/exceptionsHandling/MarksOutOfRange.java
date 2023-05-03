package exceptionsHandling;
//to create user define exception extends Exception

public class MarksOutOfRange extends Exception
{
	MarksOutOfRange(String s)
	{
		super(s);  //inherit the constructor of Exception
	}

}
