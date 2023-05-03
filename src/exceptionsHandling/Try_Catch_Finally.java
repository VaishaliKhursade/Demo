package exceptionsHandling;

public class Try_Catch_Finally 
{
	public static void main(String[] args)
{
		try
		{
			int div = 9/0;
			System.out.println(div);
		}
		catch( ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Always execute");
		}
		
	}
	
}
