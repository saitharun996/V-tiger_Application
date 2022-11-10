package collections_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsingListIterator {

	public static void main(String[] args) 
	{


		LinkedList<Integer> a=new LinkedList<>();
		a.add(1);
		a.add(23);
		a.add(45);
		a.add(33);
		System.out.println(a);
		
		System.out.println("Printing using hasnext ");
		ListIterator l=a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		System.out.println("Printing using hasprevious iterator");
		
		//Using hasPrevious
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}

	}

}
