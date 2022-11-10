package collections;

import java.util.ArrayList;

public class MethodsInCollection_ADDALL {

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
		a.addAll(a1);//addAll method is used to store object reference values also same like other values which are store normal values
		System.out.println(a);
		
		
		
	}

}
