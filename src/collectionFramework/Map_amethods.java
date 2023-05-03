package collectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_amethods {

	public static void main(String[] args) 
	{
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(111,"John");
		hm.put(3,"John");
		hm.put(222,"Alice");
		hm.put(333,"Ben");
		hm.put(333,"Jerry");//latest value is printed.....Jerry
		System.out.println(hm);
		
	
//insertion order based on keys
		
		LinkedHashMap<Integer, String>lhm=new LinkedHashMap<Integer, String>();	
		
		lhm.put(101,"aaa");
		lhm.put(101,"bbb");
		lhm.put(101,"ccc");
		System.out.println(lhm);	
		
//sorted order based on keys
		TreeMap<Integer, String>tm=new TreeMap<Integer, String>();	
		
		tm.put(22,"aaa");
		tm.put(2221,"bbb");
		tm.put(345,"ccc");
		System.out.println(tm);
		
		System.out.println(tm.descendingMap());	
		
		
//merge the map
		tm.putAll(hm);
		System.out.println(tm);
		
//to remove item for map using key
		tm.remove(22);
		System.out.println(tm);

		System.out.println("Number of items in map  :"+tm.size());
		System.out.println("To get perticular values Based on key :"+tm.get(345));
		System.out.println("Print the first key:"+tm.firstKey());
		System.out.println("Print the last  key:"+tm.lastKey());
		System.out.println("Print the First Entry key:"+tm.firstEntry());
		System.out.println("Print the Last Entry key:"+tm.lastEntry());
		
//Entry is an interface which has methods getkeys()	and getValues()
		System.out.println("-----Using For Loop--------");
		
		
		for(Entry<Integer, String>e:tm.entrySet())
		{
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		
		//or
		
		System.out.println("-----UsingIterator--------");
		
		Iterator<Entry<Integer,String>>itr=tm.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e= itr.next();
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
		
		
		
		
	}

}
