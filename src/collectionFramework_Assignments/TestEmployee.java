package collectionFramework_Assignments;

import java.util.Iterator;
import java.util.LinkedList;

import collectionFramework.Student;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(201,"Tanay", 10000);
		Employee e2 = new Employee(202,"Aanay", 20000);
		Employee e3 = new Employee(203,"Tina", 30000);
		
		LinkedList<Employee>list1=new LinkedList<Employee>();
		
		
//add objects of Employee (atleast 3 objects)		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		
//• Print Linked List in forward and backward direction.
		
		Iterator<Employee>itr = list1.listIterator();
System.out.println("-----For forward direction-------");


		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
/*System.out.println("-----For backward direction-------");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.next());
		}*/
		
//a)Print the number of values present in the list.		
		list1.size();
		System.out.println(list1.size());

//b)Remove the last value in the linked List
		
		list1.removeLast();
		System.out.println(list1);
		
		
		
		
		
		
	}
	

}
