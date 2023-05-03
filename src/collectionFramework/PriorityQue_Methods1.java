package collectionFramework;

import java.util.PriorityQueue;

 import java.util.Iterator;

public class PriorityQue_Methods1 {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer>pq=new PriorityQueue();
		pq.add(111);
		pq.add(234);
		pq.add(1);
		System.out.println(pq);
		
		pq.add(999);
		System.out.println(pq);
		
		pq.remove(999);//removes values from front
		System.out.println(pq);
		
//poll():---Removes the first values/it gives the[]if the queu is empty
//remove():---Removes the first values/it gives exceptionif the queu is empty
		
		System.out.println("Number of values present in queue :"+pq.size());
		System.out.println("To check values present or not :"+pq.contains(22));
		System.out.println("Print the first value:"+pq.peek());
		
//print using for loop
		for(Integer q:pq)
		{
			System.out.println(q);
		}
	
//Print set with Iterator
		
		Iterator<Integer>itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	
	
	}

}
