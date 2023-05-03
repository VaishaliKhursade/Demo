package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import java.util.Iterator;

public class Set_Methods 
{
public static void main(String[] args) 
{
	
	HashSet<Integer>hs=new HashSet<Integer>();
	hs.add(111);
	hs.add(1);
	hs.add(1);
	hs.add(234);
	hs.add(9087);
	System.out.println(hs);
	
//maintains insertion order
	LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
	lhs.add(22);
	lhs.add(234);
	lhs.add(234);
	lhs.add(1134);
	System.out.println(lhs);
	
//Sorted order(ascending order)
	TreeSet<Integer>ts=new TreeSet<Integer>();
	ts.add(22);
	ts.add(222);
	ts.add(22);
	ts.add(22);
	System.out.println(ts);
	
	
	System.out.println(ts.descendingSet()); //Descending Order
	
	
//Merge the set...
	ts.addAll(hs);
	System.out.println(ts);
	
	
//to remove value
	ts.remove(22);
	System.out.println(ts);
	

//to empty the set
//ts.clear();
	
	System.out.println("Number of values present in set :"+ts.size());
	System.out.println("To check values present or not :"+ts.contains(22));
	System.out.println("Print the first value:"+ts.first());
	System.out.println("Print the last value:"+ts.last());
	
	
//print the set wit for loop
	for(Integer s:ts)
	{
		System.out.println(s);
	}
	
//Print set with Iterator
	
	Iterator<Integer>itr = ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	
	
	
}
}
