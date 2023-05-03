package single_inheritance_withconstructor;

/*Rule 1 --if parent calls has constructor then it is mandetory that the child 
class should also have constructor
rule 2 --Super should always be the first statement in the constructor*/


public class Marks extends Student

{
	char grade;
	
	Marks(int rollno,String name,char grade)
	{
		super(rollno,name);  //inherit the parent class constructor
		this.grade = grade;
	}
	void display() 
	{
		System.out.println(rollno+" "+name+" "+grade);
	}
}
