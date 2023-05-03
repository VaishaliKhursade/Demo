package StringHandling;

public class StringExtraction {

	public static void main(String[] args) 
	{
		String s1 = "Java is a programming language";
		
		System.out.println(s1.substring(2));    //begin index is included
		
		System.out.println(s1.substring(2, 27));  //last index is not included

	}

}
