package abstractclass;

public class Test 
{
	public static void main(String[] args) 
	{
		//myClass c= new MyClass();
		
		//child c = new child();
		MyClass c = new Child();    //dynamic Dispatch
		c.display();
		c.msg();
		System.out.println("sum is : "+c.add(3,1));
	}

}
