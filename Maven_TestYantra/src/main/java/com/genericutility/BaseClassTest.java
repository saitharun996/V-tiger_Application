package com.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Object_Repositories.HomePageClass;
import Object_Repositories.LoginPageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest 
{
	public WebDriver driver;
	public static WebDriver sdriver;
	PropertyFileUtility propertyFileUtility=new PropertyFileUtility();
	
	@BeforeSuite(groups = {"smoke","regression","integration"})
	public void dataBaseConnection()
	{
		System.out.println("===Connected to Database===");
	}
	
	
	@AfterSuite(groups = {"smoke","regression","integration"})
	public void disConnectDatavbase() {
		System.out.println("===Dis Connected===");
	}
	

	/*
	 * Launch the browser
	 */
	
	@BeforeClass(groups = {"smoke","regression","integration"})
	public void launchBrowser() throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		sdriver=driver;
		WebDriverUtility webDriverUtility=new WebDriverUtility(driver);
		webDriverUtility.maximize();
		driver.get(propertyFileUtility.readDataFromProprtyFile("url"));
		webDriverUtility.implicitlywait();

}



	@AfterClass(groups = {"smoke","regression","integration"})
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod (groups = {"smoke","regression","integration"})
	public void logintoApp() throws Throwable {


		String uName = propertyFileUtility.readDataFromProprtyFile("username");
		String pWD = propertyFileUtility.readDataFromProprtyFile("password");

		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.login(uName, pWD);
	}
	@AfterMethod(groups = {"smoke","regression","integration"})
	public void logoutfromApp() 
	{
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.signout(driver);

	}
}
