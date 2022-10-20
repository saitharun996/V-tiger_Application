package com.crm.vtiger.testcases1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.genericutility.JavaUtility;
import com.genericutility.PropertyFileUtility;
import com.genericutility.WebDriverUtility;

public class CreateOrganisationWithIndTest 
{
	public static void main(String[] args) throws Throwable 
	{
WebDriver driver= new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		PropertyFileUtility pFU = new PropertyFileUtility();
		
		String URL=pFU.readDataFromProprtyFile("url");
		
		String username=pFU.readDataFromProprtyFile("username");
		
		String password=pFU.readDataFromProprtyFile("password");
		
		driver.get(URL);
	
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
		
		//To click on Organization module
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		//To click on add organization Icon
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//Enter Organization name & Save
		
		
		String organisationName="Tharun Inf0 Pvt Ltd459"+JavaUtility.generateRanNum();
		WebElement accountName = driver.findElement(By.name("accountname"));
		accountName.sendKeys(organisationName);
		  
		driver.findElement(By.name("button")).click();
		 
		 String orgNameAfterCreation=driver.findElement(By.className("dvHeaderText")).getText();
		 
		
		  if((orgNameAfterCreation.contains(organisationName)))
			{
		    
			System.out.println("Validated");
			
			}
			else {
				System.out.println("Not validated");
			}
		
		
		
		
		  WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		  
		Actions action=new  Actions(driver);
		
		action.moveToElement(ele).perform();
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.close();
		
		
		
		
				


	}


}
