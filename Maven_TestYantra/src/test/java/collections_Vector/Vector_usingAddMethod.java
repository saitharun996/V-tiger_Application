package collections_Vector;

import java.util.Vector;

public class Vector_usingAddMethod {

	public static void main(String[] args) {

		Vector a=new Vector();
		a.add(1);
		a.add(23);
		a.add(45);
		a.add(33);
		a.add(0, a);
		System.out.println(a);
		
	}

}
