package basicprograms;

public class OperatorsAssignment {

	public static void main(String[] args) 
	{
		
	//WAP to store the value and calculate Square and Cube 
		int i=2;
		
		System.out.println("Square of 2 : " +(i*i));
		System.out.println("Cube of 2 : " +(i*i*i));
		System.out.println("---------------------------");
		
		//WAP to store the value and calculate Area and Parimeter 
		
		int len = 3;
		int brd = 5;
		
		System.out.println("Area of rectangle :"+ (len*brd));
		System.out.println("Perimeter of rectangle :"+ (2*(len*brd)));
		System.out.println("---------------------------");
		
		//WAP to store the value and calculate Average Marks 
		
		int mar_s1= 60;
		int mar_s2= 60;
		int mar_s3= 80;
		
		int avg = (mar_s1+mar_s2+mar_s3)/3;
		
		System.out.println("Average Marks in All Subjects :"+ avg);
		
		System.out.println("---------------------------");
		
		
	}

}
