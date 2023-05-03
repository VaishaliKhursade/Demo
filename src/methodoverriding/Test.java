package methodoverriding;

public class Test {

	public static void main(String[] args) 
	{
		Apple a= new Apple();
		a.eat("Red");
	
		
		
		
		
		//dynamic Dispatch
		
		//parrent p=new Child();
		Fruit f = new Apple();
		f.eat("green");

	}

}
