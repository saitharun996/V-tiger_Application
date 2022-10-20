package com.crm.vtiger.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.genericutility.JavaUtility;
import com.genericutility.PropertyFileUtility;

public class CreateOrganisationTest {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
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
		  
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
		driver.close();

	}

}
