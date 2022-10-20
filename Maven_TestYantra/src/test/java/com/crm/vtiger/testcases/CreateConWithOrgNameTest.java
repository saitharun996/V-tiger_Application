package com.crm.vtiger.testcases;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.genericutility.ExcelFileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyFileUtility;

public class CreateConWithOrgNameTest {

	public static void main(String[] args) throws Throwable 
	{
	
		WebDriver driver= new ChromeDriver();
		
        PropertyFileUtility p = new PropertyFileUtility();
		
		String URL = p.readDataFromProprtyFile("url");
		String username = p.readDataFromProprtyFile("username");
		String password = p.readDataFromProprtyFile("password");
		
		ExcelFileUtility efu=new ExcelFileUtility();
		 
		 String fName = efu.readDataFromExcelFile("Sheet1", 7, 2);
		 String lName = efu.readDataFromExcelFile("Sheet1", 7, 3);
		String orgName = efu.readDataFromExcelFile("Sheet1", 7, 4);

		
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To open the application
		
		driver.get(URL);
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
		
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
		contact.click();
		
		WebElement newContact = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		newContact.click();
		
		WebElement name = driver.findElement(By.name("salutationtype"));
		
		Select select=new Select(name);
		
		select.selectByValue("Mr.");
		
		
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.sendKeys(fName);
		
        WebElement lastname = driver.findElement(By.name("lastname"));
		
        lastname.sendKeys(lName);

        WebElement orgName1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
		
        orgName1.click();
        
        String parentWindow=driver.getWindowHandle();
        
        Set<String> allwindows = driver.getWindowHandles();
        
        for(String allWindow:allwindows)
        	
        {
        	driver.switchTo().window(allWindow);
        	System.out.println(allWindow);
        }
         
       
        
        WebElement orgnamesearch = driver.findElement(By.name("search_text"));
        orgnamesearch.sendKeys(orgName);
        
        WebElement selectOrgName = driver.findElement(By.name("search_field"));
        
        Select select1=new Select(selectOrgName);
        
        select1.selectByVisibleText("Organization Name");
        
        WebElement searchButton = driver.findElement(By.name("search"));
        
        searchButton.click();
        
        WebElement selectName = driver.findElement(By.linkText("TataProjectsLimited"));
        
        selectName.click();
        
        driver.switchTo().window(parentWindow);
        
        WebElement saveButton = driver.findElement(By.name("button"));
        saveButton.click();
        Thread.sleep(4000);
        
		  WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		  
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.close();
        
        
        }
		
		
	

	}


