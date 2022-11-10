package collections_Vector;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset_Set {

	public static void main(String[] args)
	{
     LinkedHashSet l=new LinkedHashSet<>();
     l.add("25");
     l.add(6);
     l.add(true);
     l.add(true);
     l.add('d');
     l.add(null);
     l.add(null);
     System.out.println(l);
     
     Iterator i=l.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
	}

}
