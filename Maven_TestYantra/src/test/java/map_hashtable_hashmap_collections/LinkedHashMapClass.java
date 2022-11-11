package map_hashtable_hashmap_collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapClass {

	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> l=new LinkedHashMap<String,Integer>();
		l.put("s", 25);
		l.put("k", 34);
		l.put("m", 14);
		l.put("o", 11);
		
		System.out.println(l);
		
		Set<String> kset = l.keySet();
		//Using for each loop
		System.out.println("Printing keys");
		for(Object k:kset)
		{
			System.out.println(k);
		}
		
		System.out.println("Printing the values ");
		
		Collection<Integer> lset = l.values();
		
		for(Integer l1:lset)
		{
			System.out.println(l1);
		}
		
		//printing by using iterator.
		Set<String> i = l.keySet();
		
		Iterator i1=i.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//using the 
		Collection<Integer> e = l.values();
		for(int j=0;j<e.size();j++)
		{
			System.out.println(e.toString());
		}
		

	}

}
