package collections_Vector;

import java.util.Vector;

public class MethodsInVector {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Static");
		v.add("Block");
		v.add("NonSatic");
		v.add("Constructor");
		v.add(3, "Non Static Block");
		System.out.println(v);
		
		v.removeElement("Static");
		System.out.println(v);
		v.removeAll(v);
		System.out.println(v);
		

	}

}
