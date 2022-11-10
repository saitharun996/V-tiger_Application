package collections;

import java.util.ArrayList;

public class MethodsInCollection_LastIndexOfMethod {

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
		a.add("sai");
		
		System.out.println(a);
		
		System.out.println(a.indexOf(21));// index method is used show the specific index number for the value you mentioned.
		System.out.println(a.lastIndexOf("sai"));

	}

}
