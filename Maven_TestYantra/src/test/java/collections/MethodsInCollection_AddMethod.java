package collections;

import java.util.ArrayList;

public class MethodsInCollection_AddMethod {

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
		
		ArrayList a1=new ArrayList();
		
		a1.addAll(a);
		a1.add("jai");
		a1.add("vaishnav");
		a1.add(12);
		System.out.println(a1);
		a.add(a1);//add method is used to create separate entity of the values present in the object reference
		System.out.println(a);

	}

}
