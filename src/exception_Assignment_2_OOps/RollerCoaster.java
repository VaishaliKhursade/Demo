package exception_Assignment_2_OOps;

import exception_Assignment_2_OOps.AgeException;

public class RollerCoaster 
{
	void validage(int age) throws AgeException
	{
		if (age<12)
		{
			throw new AgeException("Too young for the ride...you should come after " +(12-age)+"years");
		}
		else if(age>65)
		{
			throw new AgeException("Too old for the ride...you should have come before " +(age-65)+"years");
		}
		else
		{
			System.out.println("Enjoy the ride");
		}
	}
	
	public static void main(String[] args) 
	{
		RollerCoaster r = new RollerCoaster();
		try
		{
			r.validage(70);
		}
		catch (AgeException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
