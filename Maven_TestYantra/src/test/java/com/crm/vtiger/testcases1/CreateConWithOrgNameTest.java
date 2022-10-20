package com.crm.vtiger.testcases1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.genericutility.ExcelFileUtility;
import com.genericutility.PropertyFileUtility;
import com.genericutility.WebDriverUtility;

public class CreateConWithOrgNameTest 
{

	public static void main(String[] args) throws Throwable 
	{
	
		WebDriver driver= new ChromeDriver();
		
		WebDriverUtility wDU=new WebDriverUtility(driver);
		
        PropertyFileUtility p = new PropertyFileUtility();
		
		String URL = p.readDataFromProprtyFile("url");
		String username = p.readDataFromProprtyFile("username");
		String password = p.readDataFromProprtyFile("password");
		
		ExcelFileUtility efu=new ExcelFileUtility();
		 
		 String fName = efu.readDataFromExcelFile("Sheet1", 7, 2);
		 String lName = efu.readDataFromExcelFile("Sheet1", 7, 3);
		 String fNType = efu.readDataFromExcelFile("sheet1", 7, 1);
		 String orgname = efu.readDataFromExcelFile("Sheet1", 7, 4);
		//To maximize the window
		wDU.maximize();
		
		wDU.implicitlywait();
		
		//To open the application
		
		driver.get(URL);
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
		
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
		contact.click();
		
		WebElement newContact = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		newContact.click();
		
		WebElement name = driver.findElement(By.name("salutationtype"));
		
		wDU.SelectByValue(name, fNType);
		
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.sendKeys(fName);
		
        WebElement lastname = driver.findElement(By.name("lastname"));
		
        lastname.sendKeys(lName);

        WebElement orgName = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
		
        orgName.click();
        
        String parentWindow=wDU.getparentHandle();
        
         wDU.allHandles(parentWindow);
         
        
        WebElement orgnamesearch = driver.findElement(By.name("search_text"));
        orgnamesearch.sendKeys(orgname);
        
        WebElement selectOrgName = driver.findElement(By.name("search_field"));
        
        wDU.SelectBYVisibleText(selectOrgName, "Organization Name");
        
        WebElement searchButton = driver.findElement(By.name("search"));
        
        searchButton.click();
        
        WebElement selectName = driver.findElement(By.linkText(orgname));
        
        selectName.click();
        wDU.allHandles(parentWindow);
        Thread.sleep(4000);
        
        WebElement saveButton = driver.findElement(By.name("button"));
        saveButton.click();
        
        
		  WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		  
	      wDU.mouseoverAction(ele);
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.close();
        
        
        }
		
		
	



}
