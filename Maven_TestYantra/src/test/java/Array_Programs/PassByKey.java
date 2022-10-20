package Array_Programs;

public class PassByKey {

	public static void main(String[] args) 
	{
		int key=3;
	
		int []a= {1,2,3,4,5,6};
		
		for (int i = 0; i < key; i++) 
		{
			int temp=a[0];
			for (int j = 1; j < a.length; j++) 
			{
				a[j-1]=a[j];

				
			}
			
			
			
			a[a.length-1]=temp;
			
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
			
		}
		

	}

}
