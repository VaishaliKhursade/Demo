package basicprograms_Assignment1;

//WAP to find the largest of two number using ternary operator


public class FindLargestNoWithTerinaryOperator {

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		
		int largeNo = (num1>num2)?num1:num2;
		int smallNo = (num1<num2)?num1:num2;
		
		System.out.println("Largest number :"+largeNo);
		System.out.println("Smallest number :"+smallNo);

	}

}
