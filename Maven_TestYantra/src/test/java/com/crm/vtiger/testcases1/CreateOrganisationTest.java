package com.crm.vtiger.testcases1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyFileUtility;
import com.genericutility.WebDriverUtility;

public class CreateOrganisationTest 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wDU= new WebDriverUtility(driver);
		
		wDU.maximize();
		wDU.implicitlywait();
	
		PropertyFileUtility pFU = new PropertyFileUtility();
		
		String URL=pFU.readDataFromProprtyFile("url");
		
		String username=pFU.readDataFromProprtyFile("username");
		
		String pwd=pFU.readDataFromProprtyFile("password");
		
		driver.get(URL);
		
		
		
		driver.findElement(By.name("user_name")).sendKeys(username,Keys.TAB,pwd,Keys.ENTER);
		
		//To click on Organization module
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		//To click on add organization Icon
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//Enter Organization name & Save
		
		
		driver.findElement(By.name("accountname")).sendKeys("Tharun Solutions"+JavaUtility.generateRanNum());
		  
		driver.findElement(By.name("button")).click();
		Thread.sleep(3000);

		  WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		  
		  wDU.mouseoverAction(ele);
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
		driver.close();

	}


}
