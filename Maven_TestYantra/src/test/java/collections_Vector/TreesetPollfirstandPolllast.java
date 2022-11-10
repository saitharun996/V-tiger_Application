package collections_Vector;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetPollfirstandPolllast {

	public static void main(String[] args)
	{
		TreeSet t=new  TreeSet();
		t.add(25);
		t.add(6);
		t.add(4);
        t.add(24);
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.pollLast());
		System.out.println(t.pollFirst());
		System.out.println(t);
		
		
		

	}

}
