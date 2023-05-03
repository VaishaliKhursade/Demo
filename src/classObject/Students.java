package classObject;

//initilizing using methods

public class Students {

	 int rollno;
	 String name;
//	                           //101  john
//	 void inputStudents(int r String n)
//	 {
//	 rollno=r;
//    name=n;
//	 }
//	  OR
	 
	 void inputStudents(int rollno, String name) 
	 {
		 this.rollno = rollno;    //this -- is a reference keyword which point the variable within the same class
		 
		 this.name = name;
	 }
	 void display() 
	 {
		 System.out.println(rollno+" "+name);
	 }

	public static void main(String[] args) 
	{
		 Students s = new Students();
		 s.inputStudents(101, "john");
		 s.display();
	}

}
