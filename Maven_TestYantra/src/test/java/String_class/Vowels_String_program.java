package String_class;

public class Vowels_String_program {

	public static void main(String[] args)
	{
		String[] s= {"sravan","tharun","raju"};
		
	
		
	
		
		for (int i = 0; i < s.length; i++)
		{
			String str=s[i];
			int count=0;
			
			for (int j = 0; j < str.length(); j++) 
			{
				char ch = str.charAt(j);
				
				if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u')
				{
					
					count++;
				}
			
			}
			System.out.println(s[i]+" vowels count is "+count);
			
		}
		
		
		
		
		
	
		

}
}
