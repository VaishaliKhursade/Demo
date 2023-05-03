package StringHandling;

public class StringFunctions {

	public static void main(String[] args) 
	{
		String s1 = "Java is a programming language";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println("to check if the String start with :"+s1.startsWith("J"));
		System.out.println("to check if the String end with :"+s1.endsWith("J"));

		System.out.println(s1.length());
		System.out.println(s1.contains("Java"));
		
		
		String s2 = "Hello";
		String s3 = "Bye";
		System.out.println(s2.concat(s3));
		
		
		System.out.println(s1.replace("Java", "Python"));
		System.out.println(s1);
		
		
		
		
		
	}

}
