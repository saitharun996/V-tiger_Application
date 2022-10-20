package Array_Programs;

public class Finding_A_SecondMaxNum {

	public static void main(String[] args)
	{
		int []a= {1,34,55,66,23,78};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
				
			}
		}
		
		System.out.println(a[a.length-2]);
			
			
//			for (int j = 0; j < a.length; j++) 
//			{
//				
//				break;
//				
//			}
//			
			
			
		}
		

	}

