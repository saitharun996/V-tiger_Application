package Array_Programs;

public class ReverseAnArray {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,45,66,78};
		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++) 
		{
			if(start<end) {
				int temp=a[start];
				 a[start]=a[end];
				 a[end]=temp;
				 
				 start++;
				 end--;
				
				
			}
			
			System.out.print(a[i]+" ");
			
		}
	

	}

}
