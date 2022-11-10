package String_class;

public class A_Word_Containing_O {

	public static void main(String[] args)
	{
		String s="Hello who are you";
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			boolean con=str1.contains("o");
			if (con==true)
			{
				System.out.println(str1);
				
			}
		}

	}

}
