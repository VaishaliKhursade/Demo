package loops;

public class Pattern1UsingNestedForLoop {

	public static void main(String[] args) 
	{
		System.out.println("-------------Pattern 1------------"); 
		
		
		for(int i=1;i<=3;i++)              //for rows.....i
		{
			for(int j=1;j<=3;j++)          //for columns.....j
			{
				System.out.print("*"+" ");
			}
			System.out.println();           //Bring the cursor down the next line
		}

		
		
		
		System.out.println("-------------Pattern 2------------"); 	
		
		
		int k=1;
		
		for(int i=1;i<=3;i++)              //for rows.....i
		{
			for(int j=1;j<=3;j++)           //for columns.....j
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		
		System.out.println("-------------Pattern 3------------"); 		
		
		char ch= 'A';                     //A=65     ASCII a=97
		
		for(int i=1;i<=3;i++) 
		{
			for(int j=1;j<=3;j++) 
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		
		
		
	}

}
