package collections;

import java.util.ArrayList;

public class MethodsInCollection_RemoveALL {

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
		
		
		System.out.println(a1);
        a.addAll(a1);
        System.out.println(a);
        a.removeAll(a1);
        System.out.println(a);
        a.removeAll(a);
        System.out.println(a);
        
	}

}
