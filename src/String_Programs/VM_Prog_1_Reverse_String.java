package String_Programs;

import java.util.Scanner;

//wap to read a String and display the reverse of String?

public class VM_Prog_1_Reverse_String {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
				String str = sc.nextLine();
				int len = str.length();
				
		System.out.println("======Reverse of String=====");
				
		
		for (int i=len-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			System.out.println(ch+" ");
		}
		sc.close();

	}

}
