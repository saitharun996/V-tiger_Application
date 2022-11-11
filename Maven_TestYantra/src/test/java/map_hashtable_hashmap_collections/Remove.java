package map_hashtable_hashmap_collections;

import java.util.Hashtable;

public class Remove {

	public static void main(String[] args)
	{
		Hashtable<String, Integer> h=new Hashtable<String, Integer>();
		  h.put("s", 25);
	      h.put("r", 32);
	      h.put("k", 30);
	      h.put("o", 34);
	      h.put("r", 65);
	      
	      
	      System.out.println(h.remove("s"));
	      System.out.println(h);
		

	}

}
