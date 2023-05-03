package arrays;

public class TwoDArrays {

	public static void main(String[] args) 
	{
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Using nested for loop");
		
		 for(int i=0;i<3;i++)   //for rows
		 {
			 for(int j=0;j<3;j++)   //colmns
			 {
				System.out.print(arr[i][j]+"  ");
			 }
			 System.out.println();
		 }
		 
		
		 System.out.println("Using ehanced for loop");
		 
		 for(int a[]:arr) 
		 {
			 for(int b:a)
			 {
				 System.out.print(b+" ");
			 }
			
		 }
		 System.out.println(); 
			 
		 
		 
		 
		 
		 
	}

}
