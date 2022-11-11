package map_hashtable_hashmap_collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class ToPrintKeySeparatelyValuesSeparately {

	public static void main(String[] args) 
	{
     Hashtable<String, Integer> h=new Hashtable<String, Integer>();
      h.put("s", 25);
      h.put("r", 32);
      h.put("k", 30);
      h.put("o", 34);
      h.put("r", 65);
      
      System.out.println(h);
      
      Hashtable<String, Integer> h1=new Hashtable<String, Integer>(h);
      System.out.println(h1);
      
      System.out.println("printing the keys");
      Set<String> ks = h1.keySet();
      for(String kset:ks)
      {
    	  System.out.println(kset);
      }
      System.out.println("printing the values ");
      Collection<Integer> val = h1.values();
      Iterator i=val.iterator();
      while(i.hasNext())
      {
    	  System.out.println(i.next());
    	  
      }
      
    		 
	}

}
