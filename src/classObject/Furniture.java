package classObject;

public class Furniture 
{
	//data -members/global variables : Can be access through the whole class
			String colour = "Brown";
			int price = 10000;
			
			//write a method to display color and price..
			void display()       //.....declaration
			{
				               //int a;     local variable can access only within the same method
				
				System.out.println(colour+"  "+price);  //defination
			}
	

	public static void main(String[] args) 
	{                                                       //new allocate memory at run time
		Furniture table = new Furniture();                  //create object of furniture class
		
		table.display();                                     //calling the method
			
			
	}
		
		
		

}


