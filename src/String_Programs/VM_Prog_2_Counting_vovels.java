package String_Programs;

	//wap to read a String and display the count of Vowels?

import java.util.Scanner;

public class VM_Prog_2_Counting_vovels 
	{

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
				String str = sc.nextLine();
				int len = str.length();
				int vcount = 0;
		
				for(int i=0;i<=len-1;i++)
				{
					char ch = str.charAt(i);
					switch(ch)
					{
					case'a':
					case'A':vcount++;
					break;
					
					case'e':
					case'E':vcount++;
					break;
					
					case'i':
					case'I':vcount++;
					break;
					
					case'o':
					case'O':vcount++;
					break;
					
					case'u':
					case'U':vcount++;
					break;
					
					}
				}
		System.out.println("Count Of Vovels :"+vcount);			

	}

}
