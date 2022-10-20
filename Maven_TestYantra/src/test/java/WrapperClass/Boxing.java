package WrapperClass;

public class Boxing {

	public static void main(String[] args) 
	{
		//Boxing : The process of converting  primitive datatype into non-primitive datatype
		byte b=12;//primitive
		Byte b1=new Byte(b);  //Non primitive
		System.out.println(b1);
		
		short s=134;
		Short  s1=new Short(s);
		System.out.println(s);
		
		int i=12;//primitive 
		Integer i1=new Integer(i); //Non primitive
		System.out.println(i1);
		
		long l=179898;
		Long l1=new Long(l);
		System.out.println(l1);
		
		float f=2.45f;
		Float f1=new Float(f);
		System.out.println(f1);
		
		double d=200.345;
		Double  d1=new Double(d);
		System.out.println(d1);
		
		char c='A';
		Character c1=new Character(c);
		System.out.println(c1);
		
		//note: From jdk 1.5 autoboxing can be done  without creating an object
		
		//Autoboxing
		
		int n=134;
		Integer n1=n;
		System.out.println(n1);
		
		short  s2=234;
		Short  s3=s2;
		System.out.println(s3);
		
		byte b2=12;
		Byte b3=b2;
		System.out.println(b3);
		
		//UnBoxing : The process of converting  non-primitive datatype into primitive
		
		//1st way
		byte j=24;
		Byte j1=new Byte(j);
		byte j2=j1.byteValue();
		System.out.println(j2);
		
		
		
		
		
		
		
		
		
		
	

	}

}
