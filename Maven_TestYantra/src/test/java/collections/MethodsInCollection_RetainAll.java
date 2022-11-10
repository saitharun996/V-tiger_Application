package collections;

import java.util.ArrayList;

public class MethodsInCollection_RetainAll {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		System.out.println(a.isEmpty());
        System.out.println("After adding the values into a collection are");
		
		a.add("sai");
		a.add("tharun");
		a.add('b');
		a.add(21);
		a.add(12.0);
		
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.add(11);
		a1.add('c');
		a1.add(21);
		a.add(a1);
		
		a.retainAll(a1);
		System.out.println(a);//This method is used to remove all the elements except common element.
		
		System.out.println();
		

	}

}
