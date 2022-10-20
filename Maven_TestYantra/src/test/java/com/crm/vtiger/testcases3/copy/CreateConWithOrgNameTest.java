package com.crm.vtiger.testcases3.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.ExcelFileUtility;
import com.genericutility.PropertyFileUtility;
import com.genericutility.WebDriverUtility;

import Object_Repositories.ContactPageClass;
import Object_Repositories.HomePageClass;
import Object_Repositories.LoginPageClass;
import Object_Repositories.NewContactPageClass;

public class CreateConWithOrgNameTest {

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
		 String orgname = efu.readDataFromExcelFile("Sheet1", 7, 4);
		//To maximize the window
		wDU.maximize();
		
		wDU.implicitlywait();
		
		//To open the application
		
		driver.get(URL);
		
		//To Login the application
		
		LoginPageClass lpc=new LoginPageClass(driver);
		
		lpc.login(username, password);
		
		ContactPageClass cpc=new ContactPageClass(driver);
		
		cpc.cButton();
		
		NewContactPageClass npc=new NewContactPageClass(driver);
		
		npc.NewContactButton();
		
		npc.Name(fName, lName);
		
		WebElement ele = driver.findElement(By.name("salutationtype"));
		
		npc.RespectTerm(ele, 1);
	
		npc.organButton();
        
        String parentWindow=wDU.getparentHandle();
        
         wDU.allHandles(parentWindow);
         
        npc.OrgNameSearch(orgname);
        npc.orgSelect();
        npc.orgNameSearchButton();
        npc.selectNameOrg();
        
      WebElement selectName = driver.findElement(By.linkText(orgname));
        
       selectName.click();
        wDU.allHandles(parentWindow);
        Thread.sleep(4000);
        
        
        npc.sButton();
        
        HomePageClass hpc=new HomePageClass(driver);
        
        hpc.signout(driver);
        
		driver.close();
        

		

	}

}
