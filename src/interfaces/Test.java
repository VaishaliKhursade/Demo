package interfaces;

public class Test {

	public static void main(String[] args) 
	{
		myinterface m = new Child_class();
		m.display();                         //default method
		m.msg();
		System.out.println("Sum is :"+m.add(2, 3));
		
		myinterface.printmsg();            //calling static methods
	}

}
