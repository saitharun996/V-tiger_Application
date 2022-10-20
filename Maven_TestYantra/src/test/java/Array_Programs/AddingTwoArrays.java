package Array_Programs;

public class AddingTwoArrays {

	public static void main(String[] args) 
	{
		int[]a= {1,4,32,5,6,18,6};
		int[]b= {22,31,6,5};
		int c=0;
		if(a.length>b.length)
		{
			 c=a.length;
		}
		
		for (int i = 0; i < c; i++)
		{
			try {
				System.out.println(a[i]+b[i]);
				
			} catch (Exception e) {
				
				
				if(a.length>b.length)
				{
					System.out.print(a[i]);
				}
				
				else
				{
					System.out.print(b[i]);
				}
			}
		}
		
		

	}

}
