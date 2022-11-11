package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollFrame_UsingIntegerComparator implements Comparator {
    
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer)o1;
		Integer i1=(Integer)02;
		if (i<i1)
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
		ArrayList a= new ArrayList();
		
		a.add(12);
		a.add(34);
		a.add(54);
		a.add(14);
		a.add(25);
		
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		
		//If we want sort in descending order
		CollFrame_UsingIntegerComparator c=new CollFrame_UsingIntegerComparator();
		
		Collections.sort(a,c);
		System.out.println(a);
		
		
		

	}

}
