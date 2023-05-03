package StringHandling;

public class StringBuilder_Methods {

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		
		
		//to add at the end
		
		sb.append("  Languege");
		System.out.println(sb);
		
		
		//to insert at a particular position
		
		sb.insert(4, " is a");
		System.out.println(sb);
		
		
		//to delete
		sb.delete(2, 12);     //last index is not deleted
		System.out.println(sb);
		
		
		//to delete single character
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		//to replace
		sb.replace(0, 2, "zzzz"); //end index is not replaced
		System.out.println(sb);
		
		//to reverse
		sb.reverse();
		System.out.println(sb);
		

	}

}
