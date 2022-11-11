package collections_Vector;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Set {

	public static void main(String[] args)
	{
		TreeSet t=new  TreeSet();
		t.add(25);
		t.add(6);
		t.add(4);
	//	t.add("sai");
	//   t.add(null);
	//	t.add(null);
		t.add(6);
		System.out.println(t);
		
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
