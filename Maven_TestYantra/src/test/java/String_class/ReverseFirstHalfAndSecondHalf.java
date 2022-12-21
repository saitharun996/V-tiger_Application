package String_class;

//Write a program to reverse first half separately and 2nd half separately
public class ReverseFirstHalfAndSecondHalf {

	public static void main(String[] args)
	{
		String s="Saitharuno";
		char[] c = s.toCharArray();
		
		String s1 = "";
		String s2 = "";
		
		for(int i=0;i<c.length;i++)
		{
			if(i<c.length/2)
			{
				s1=c[i]+s1;
			}
			
			else
			{
				s2=c[i]+s2;
			}
			
		}

		System.out.println("The value of first half are "+s1);
		System.out.println("The value of Second half are "+s2);
		

	}

}
