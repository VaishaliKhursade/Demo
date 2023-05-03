package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;



public class Arraylist_Methods {

	public static void main(String[] args) 
	{
	//<Integer>is a generic class which allows Arraylist to store
	//only integer value
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(101);
		list1.add(102);
		list1.add(103);
		list1.add(101);
	System.out.println(list1);
	
	//to replace the value in Arraylist
	
	list1.set(1, 890);
	System.out.println(list1);	
	
	//to get the part of the list
	
	System.out.println(list1.subList(0, 3));  //last index is not included
	
	//to merge the arraylistCreate a new arraylist
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	list2.add(33);
	list2.add(22);
	list2.add(332);
	list2.add(567);
	System.out.println(list2);
		
		list1.addAll(list2);  //merge the two lists
		System.out.println(list1);
		
		
	//remove():- to remove the values from the list using index
		list1.remove(0);
		System.out.println(list1);
		
		//to empty the arraylit
		//list1.clear();
	//	System.out.println(list1);
		
		
		// Sorting the list : Descending order
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		System.out.println("Number of vallues present in the Arraylist :"+list1.size());
		System.out.println("to get the vallues in perticular index :"+list1.get(0));
		System.out.println("to print the index of any value :"+list1.indexOf(999));
		System.out.println("to check whether the vallue is present or not : "+list1.contains(999));
		
		
//print Arraylist using enhance forloop.....
		System.out.println("-----using for loop");
		
		for(Integer a:list1) 
		{
			System.out.println(a+",");
		}
		
//print Array using List Iterator both forward and backward direction
		System.out.println("-----using list iterator-------");
		
		ListIterator<Integer> itr1 = list1.listIterator();
		System.out.println("-----For forward direction-------");
		
		while(itr1.hasNext()) //Forward direction
		{
			System.out.println(itr1.next());
		}
		
 
		
		System.out.println("-----For backword direction-------");
	
		while(itr1.hasPrevious()) //Forward direction
		{
			System.out.println(itr1.previous());
		}
		
		
//print array using Iterator only forward direction
		
		
		System.out.println("-----Using Iterator-------");
		
		Iterator<Integer> itr2 = list1.iterator();
		
		System.out.println("----- forward direction-------");
		while(itr2.hasNext()) //Forward direction
		{
			System.out.println(itr2.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
