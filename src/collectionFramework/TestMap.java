package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args)
	{
		Student s1 = new Student(101,"john");
		Student s2 = new Student(102,"Alice");
		
		       //key   , value
		TreeMap<Integer,Student>tm = new TreeMap<Integer,Student>();
		tm.put(111, s1);
		tm.put(222, s2);
		
		for(Map.Entry<Integer, Student>m:tm.entrySet())
		{
			System.out.println(m.getKey()+"====>"+m.getValue());
		}

	}

}
