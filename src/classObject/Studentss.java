package classObject;

// initilizing using constructor


public class Studentss 
{
	int rollno;
	String name;
	int age;
	
	Studentss()
	{
		System.out.println("Default Constructor");
		
	}
	Studentss(int rollno, String name)
	{   
		this();                    //calls the default constructor
		this.rollno = rollno;
		this.name = name;
	}
	Studentss(int age)
	{
		this(11,"Ram");
		this.age=age;
	}
	
	void display() 
	{
		System.out.println(rollno+"  "+name+"  "+age);
	}
	
	
	
	public static void main(String[] args) 
	{
		//Studentss s1 = new Studentss();
		Studentss s2 = new Studentss(30);   //Parameterized constructor
        s2.display();
	}

}
