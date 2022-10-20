package TestNGPracticeTest;

import org.testng.annotations.Test;

public class DemoTest extends AnnotationsTest
{
	@Test(groups = "Integration")
	public void test1()
	{
		System.out.println("Integration Testing for 1st testcase1");
	}
	
	@Test(groups="Integration")
	public void test2()
	{
		System.out.println("Integration Testing for 2nd testcase");
	}
	
	@Test(groups="Regression")
	public void test3()
	{
		System.out.println("regression Testing for 2nd testcase");	
	}
	
	public void basetest()
	{
		System.out.println("Base Test");
	}

}
