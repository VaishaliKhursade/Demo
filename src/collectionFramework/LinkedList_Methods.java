package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Methods {

	public static void main(String[] args) 
	{
		LinkedList<Integer>list1=new LinkedList<Integer>();
		list1.add(111);
		list1.add(22);
		list1.add(908);
		list1.add(111);
		System.out.println(list1);
		
//To add vallue at first position
		list1.addFirst(789);
		System.out.println(list1);
		

//To add vallue at last position	
		
		list1.addLast(123);
		System.out.println(list1);
		
//To add vallue at Perticular position		
		
		list1.add(1, 300);
		System.out.println(list1);
		
//to replace value in linkedlist
		list1.set(0, 500);
		System.out.println(list1);
		
		
//to get the part of the list
		System.out.println(list1.subList(0, 3)); //last index is not included
		
		
//to merge a list and create a arraylist		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(222);
		list2.add(12);
		list2.add(22342);
		list2.add(234);
		System.out.println(list2);
		
		
		list1.addAll(list2);   //Merge Array list with linked list
		System.out.println(list1);
		
		
//to remove value using Index		
		
		list1.remove(1);
		System.out.println(list1);
		
//to remove value At the begening
		list1.removeFirst();
		System.out.println(list1);
		
//to remove value At the end
		list1.removeLast();
		System.out.println(list1);
		
//		
		
		
		
		
		
//sort the value in assending order
		Collections.sort(list1);
		System.out.println(list1);
		
		
//sort the value in descending order
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		System.out.println("Number of vallues present in the list :"+list1.size());
		System.out.println("to get the vallues at First position :"+list1.getFirst());
		System.out.println("to get the vallues at Last position :"+list1.getLast());
		System.out.println("to get the vallues at perticular position :"+list1.get(1));
		System.out.println("to print the index of any value :"+list1.indexOf(234));
		System.out.println("to check whether the vallue is present or not : "+list1.contains(999));
		
		
		System.out.println("---print using for loop------"); 	
		
		for(Integer i:list1)
		{
			System.out.println(i);
		}
		
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
