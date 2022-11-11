package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollFrame_UsingStringComparator implements Comparator {
   
	
	@Override
public int compare(Object o1, Object o2)
	{
		String s=(String)o1;//Downcasting
		String s1=(String)o2;
		
		if (s.compareTo(s1)>0) {
			return 1;
		}
		
		else if(s.compareTo(s1)<0)
		{
			return -1;
		}
	return 0;
}

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		
		a.add("krishna");
		a.add("kunti");
		a.add("karna");
		a.add("kamsa");
		
		System.out.println(a);
		CollFrame_UsingStringComparator cf=new CollFrame_UsingStringComparator();
		
		Collections.sort(a, cf);
		System.out.println(a);
		
		
		
		

	}

}

