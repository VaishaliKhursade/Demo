package superKeyword;

public class Dog extends Animal
{
	String colour = "Black";
	void eat()
	{
		System.out.println("Eating Bread...");
	}
	void printcolor()
	{
		System.out.println(this.colour);    //Prints within the same class
		System.out.println(super.colour);   // Point to Parent class
		
		this.eat();     //calls method from same class 
		
		super.eat();     //Calls methods from parrent class
		
	
		
	}
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.printcolor();
		
		
	}
	
}
