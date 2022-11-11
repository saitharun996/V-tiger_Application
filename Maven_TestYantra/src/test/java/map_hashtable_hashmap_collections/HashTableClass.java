package map_hashtable_hashmap_collections;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args)
	{
       Hashtable h=new Hashtable();
       h.put("s", 25);
       h.put('s', 25);
       h.put('s', 56);//duplicates are not allowed i.e it will reassign it will take the latest value
       h.put(2.0, "tyss");
       h.put(2, "bng");
       h.put(2, 100);
       h.put(2, 'y');
       
       System.out.println(h);
	}

}
