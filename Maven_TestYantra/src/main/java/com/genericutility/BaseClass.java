package com.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Object_Repositories.HomePageClass;
import Object_Repositories.LoginPageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver sdriver;
	public WebDriver driver;
	
	PropertyFileUtility propertyuFileUtility=new PropertyFileUtility();
	
	@BeforeSuite(groups = {"smoke","regression","integration"})
	public void databaseConnection()
	{
		System.out.println("===connected to Database === ");
	}
	
	@AfterSuite(groups = {"smoke","regression","integration"})
	public void databaseDisconnect()
	{
		System.out.println("===disconnected to database===");
	}

	
	@BeforeClass(groups = {"smoke","regression","integration"})
	
		public void launchBrowser(String browser) throws Throwable
		{
		
		 
			  WebDriverManager.chromedriver().setup();
			  
			  driver=new ChromeDriver();
			
		 // sdriver=driver;
		  
		  WebDriverUtility webDriverUtility=new WebDriverUtility(driver);
		  webDriverUtility.maximize();
		  driver.get(propertyuFileUtility.readDataFromProprtyFile("url"));
		  
		  webDriverUtility.implicitlywait();
			
		}
		
	
	
	 @AfterClass(groups = {"smoke","regression","integration"})
	  public void closebrowser()
	  {
		  driver.close();
	}
	
	@BeforeMethod(groups = {"smoke","regression","integration"})
	   public void logintoApp() throws Throwable
	   {
		String un = propertyuFileUtility.readDataFromProprtyFile("username");
		String pwd = propertyuFileUtility.readDataFromProprtyFile("password");
		
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.login(un, pwd);
	   }
	
	@AfterMethod(groups = {"smoke","regression","integration"})
	public void logoutfromapp()
	{
		HomePageClass homePageClass=new HomePageClass(driver);
		
		homePageClass.signout(driver);
	}
	 
}
