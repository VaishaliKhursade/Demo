package classObject;

public class Square {
	
	int num = 2;
	//write a method to write the square of numbers
	
	
	int calSQuare() 
	{
		int sq = num*num;
		return sq;                           //last Statement in method
	}
	

	public static void main(String[] args) 
	{
		Square obj = new Square();
		int result = obj.calSQuare();
		System.out.println( "Square is :"+(result*10));
		
		//OR
		
		System.out.println( "Square is :"+obj.calSQuare());
				

	}

}
