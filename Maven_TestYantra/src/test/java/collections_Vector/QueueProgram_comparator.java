package collections_Vector;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import ComparableAndComparator.Employee;

public class QueueProgram_comparator implements Comparator {
  
	
	@Override
	public int compare(Object o1, Object o2)
	{
		Integer i=(Integer)o1;
		Integer i1=(Integer)o2;
		if(i>i1)
		{
			return 1;
		}
		else if(i<i1)
		{
			return -1;
		}
		return 0;
	}

	public static void main(String[] args)
	{
		Queue q=new PriorityQueue(new QueueProgram_comparator());
		q.offer(12);
		q.offer(32);
		q.offer(45);
		q.offer(26);
		q.offer(39);
		
		System.out.println("Printing the values");
		for(Object list:q)
		{
			System.out.println(list+" ");
		}
		
		System.out.println("removing values");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
		

	}

}
