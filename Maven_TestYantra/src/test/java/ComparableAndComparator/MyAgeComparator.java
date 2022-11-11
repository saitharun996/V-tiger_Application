package ComparableAndComparator;

import java.util.Comparator;

public class MyAgeComparator implements Comparator 
{
	
	@Override
	public int compare(Object o1, Object o2) {
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		
		if (e.age>e1.age)
		{
			return 1;
			
		}
		
		else if(e.age<e1.age)
		{
			return -1;
		}
		
		return 0;
	}

	
	

	

}
