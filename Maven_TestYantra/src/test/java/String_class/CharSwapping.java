package String_class;

public class CharSwapping {

	public static void main(String[] args) 
	{
		String s="a*#b8%d#z"; //z*#d8%b#a
				char[] ch=s.toCharArray();
				int left=0;
				int right=ch.length-1;//right =8
				for (int i = 0; i < ch.length; i++) 
				{
					if (ch[left]>='a' && ch[left]<='z') {
					if (ch[right]>='a' && ch[right]<='z') 
					{
						if(left<right)
						{
							char temp=ch[left];
							ch[left]=ch[right];
							ch[right]=temp;
							
							left++;
							right--;
						}
						else
						{
							left--;
						}
						
					}
					else
					{
						right++;
					}
						
					}
					
				}
				System.out.println(ch);
		

	}

}
