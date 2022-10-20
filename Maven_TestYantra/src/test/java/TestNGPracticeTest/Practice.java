package TestNGPracticeTest;

import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.Test;

import com.genericutility.BaseClass;

public class Practice extends BaseClass
{
	@Test()
	public void m1()
	{
		System.out.println("Method 1 execution");
	}
	
	@Test()
	public void m2()
	{
		System.out.println("Method 2 execution");
		
	}
	

}
