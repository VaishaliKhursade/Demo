package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArraylist {

	public static void main(String[] args)
	{
		Student s1 = new Student(101,"john");
		Student s2 = new Student(102,"Alice");
		
	//	System.out.println(s1+"\n"+s2);
		
//create Arraylist and make it generic to Student class...
		ArrayList <Student>list1 =new ArrayList<Student>();
		
//add object of students to list
				list1.add(s1);
				list1.add(s2);
				
//Print using Iterator	
		Iterator <Student> itr = list1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
				
	}

}
