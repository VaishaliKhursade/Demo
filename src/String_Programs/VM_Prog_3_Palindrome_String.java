package String_Programs;

import java.util.Scanner;

//wap to check the given String is palindrome String or not?

public class VM_Prog_3_Palindrome_String 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
				String str = sc.nextLine();
				int len = str.length();
				int m  = 0;
				int z = len-1;           //last index value
		for(int i=0;i<=len-1;i++)
		{
			char ch1 = str.charAt(i);   //first
			char ch2 = str.charAt(z);    //last
			if(ch1==ch2)
			{
				m++;
			}
			z--;
		}
		if(m==len)
		{
			System.out.println("Palindrome String....");
		}else
		{
			System.out.println("Non Palindrome String....");
		}
		sc.close();		
				
				
				

	}

}
