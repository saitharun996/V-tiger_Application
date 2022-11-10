package collections;

import java.util.ArrayList;

public class MethodsInCollection_SizeMethod {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.isEmpty());
        System.out.println("After adding the values into a collection are");
		
		a.add("sai");
		a.add("tharun");
		a.add('b');
		a.add(21);
		a.add(12.0);
		
		System.out.println(a);
		System.out.println(a.size());

	}

}
