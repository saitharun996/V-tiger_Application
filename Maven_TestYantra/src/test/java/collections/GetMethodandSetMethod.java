package collections;

import java.util.ArrayList;

public class GetMethodandSetMethod {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();

		a.add("sai");
		a.add("tharun");
		a.add('b');
		a.add(21);
		a.add(12.0);
		System.out.println(a);
		
		System.out.println("after get and set method");
		
		System.out.println(a.get(2));
		a.set(3, "charan");
		System.out.println(a);
		

	}

}
