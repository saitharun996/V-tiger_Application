package map_hashtable_hashmap_collections;

import java.util.TreeMap;

public class TreeMaoClass {

	public static void main(String[] args)
	{
      TreeMap<Integer,String > t=new TreeMap<Integer,String>();
      t.put(23, "cherry");
      t.put(85, "babu");
      t.put(34, "harsha");
      t.put(76, "bittu");
      t.put(12, "krishna");
      
      
      System.out.println(t);
      System.out.println(t.lastKey());
      System.out.println(t.firstKey());
      System.out.println(t.lastEntry());
      System.out.println(t.firstEntry());
      System.out.println(t.headMap(100));
      System.out.println(t.tailMap(12));
      System.out.println(t.descendingKeySet());
      System.out.println(t.descendingMap());
      
	}

}
