package fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(in);
		
		System.out.println("Enter the name :");
		String name = bfr.readLine();
		System.out.println("Your name is : "+name);
		
		System.out.println("Enter the number");
		String num = bfr.readLine();
		int n = Integer.parseInt(num); //convert String to int......
		System.out.println("Square is:"+(n*n));
		bfr.close();
	}

}
