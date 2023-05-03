package loops_assignment_2;

	//8) Generate Fibonacci series of a given range.
public class Assi_2Ex_8Fibonacci {

	public static void main(String[] args)
	{
		int n1 = 0 ,n2 = 1, sum = 0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<10;i++)
			
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2 = sum;
					
		}

}
}