package WrapperClass;

public class Parsing_WrapperClass {

	public static void main(String[] args) 
	{
		String s="123";
		
		//
		
		//Converting String into integer
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		
		//Converting String into short
		short s1=Short.parseShort(s);
		System.out.println(s1);
		
		//converting String into float
		float f1 = Float.parseFloat(s);
		System.out.println(f1+1.2);
		
		//converting String into boolean
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		
		//Converting String into double
		double  d=Double.parseDouble(s);
		System.out.println(d);
		
		//converting String into byte
		byte b1=Byte.parseByte(s);
		System.out.println(b1);
		
		
		
		

	}

}
