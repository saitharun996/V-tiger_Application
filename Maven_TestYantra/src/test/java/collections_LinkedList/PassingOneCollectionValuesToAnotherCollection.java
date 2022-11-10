package collections_LinkedList;

import java.util.LinkedList;

public class PassingOneCollectionValuesToAnotherCollection {

	public static void main(String[] args)
	{
		LinkedList<Integer> a=new LinkedList<>();
		a.add(1);
		a.add(23);
		a.add(45);
		a.add(33);
		System.out.println(a);
		LinkedList l=new LinkedList(a);
		l.add("Venkatesh");
		System.out.println(l);
		

	}

}
