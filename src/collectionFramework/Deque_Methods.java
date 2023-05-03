package collectionFramework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

import java.util.Iterator;

public class Deque_Methods {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer>aq=new ArrayDeque<Integer>();
		aq.add(111);
		aq.add(900);
		aq.add(234);
		System.out.println(aq);
		
//add values at the first
		aq.addFirst(8999);
		System.out.println(aq);
		
//add values at the end
		aq.addLast(1234);
		System.out.println(aq);
		
		
//remove value from first
		aq.remove();
		System.out.println(aq);
		
//remove values at the end
		aq.removeLast();
		System.out.println(aq);
		
		
//create a priority queue And merge with ArrayDeque		
		
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		
		pq.add(222);
		pq.add(890);
		pq.add(2234);
		
		aq.addAll(pq);    //to merge the queues
		
		System.out.println(aq);
		
		
		System.out.println("Number of values  :"+aq.size());
		System.out.println("To check values present or not :"+aq.contains(22));
		System.out.println("Print the first value:"+aq.getFirst());
		System.out.println("Print the last value:"+aq.getLast());
		
//print using for loop
		System.out.println("-----Using For Loop--------");
				for(Integer q:aq)
				{
					System.out.println(q);
				}
				
		
//Print set with Iterator
				
				Iterator<Integer>itr=aq.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
	}

}
