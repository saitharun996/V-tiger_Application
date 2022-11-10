package collections_LinkedList;

import java.util.LinkedList;

public class LinkedList_AddingTheValuesUsingIndexing {

	public static void main(String[] args)
	{

		LinkedList<Integer> a=new LinkedList<>();
		a.add(1);
		a.add(23);
		a.add(45);
		a.add(33);
		System.out.println(a);
		System.out.println("The object present in 3rd postion");
		System.out.println(a.get(2));
	    
		//Adding through indexing
		a.add(2, 9);
		System.out.println(a);

	}

}
