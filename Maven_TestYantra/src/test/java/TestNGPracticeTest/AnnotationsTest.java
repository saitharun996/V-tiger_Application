package TestNGPracticeTest;

import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("@BeforeSuite");
	}
	
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("@BeforeMethod");
		
	}

	@BeforeTest
	public void BT()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("@BeforeClass");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("@AfterSuite");
	}
	
	@AfterClass
	public void AC()
	{
	   System.out.println("@BeforeTest");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("@AfterMethod");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("@AfterTest");
	}
	
	
	@BeforeTest
	public void m1()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void m22()
	{
		System.out.println("Test Method executed");
	}
	
	
	
}

