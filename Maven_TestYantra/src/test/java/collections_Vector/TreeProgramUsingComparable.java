package collections_Vector;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeProgramUsingComparable implements Comparator {
    
	
	@Override
	public int compare(Object o1, Object o2) {
    
		Integer  i=(Integer)o1;
		Integer  i1=(Integer)o2;
		if(i<i1)
		{
			return 1;
			
		}
		else if(i>i1)
		{
			return -1;
		}
		
		return 0;
	}

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new TreeProgramUsingComparable());
		
		t.add(12);
		t.add(16);
		t.add(87);
		t.add(98);
		t.add(24);
		
		System.out.println(t);

	}

}
