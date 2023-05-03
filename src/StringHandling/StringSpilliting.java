package StringHandling;

public class StringSpilliting {

	public static void main(String[] args) 
	{
		String s1 = "Java is a programming language";
		String words [] = s1.split(" ");
		
		//String words[]= s1.split(" ", 3);
		
		for(String s:words)
		{
			System.out.println(s);
		}
		

	}

}
