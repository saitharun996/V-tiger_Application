package String_class;

public class SeparatenumbersFrom_A_Word {

	public static void main(String[] args)
	{
		String s="a11b22c33";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char charr=s.charAt(i);
			if (charr>='0'&&charr<='9')
			{
				int num=charr-48;
				sum=sum+num;
				
			}
		}
		
		System.out.println(sum);
		

	}

}
