package com.crm.vtiger.testcases3.copy;

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

import Object_Repositories.HomePageClass;
import Object_Repositories.LoginPageClass;
import Object_Repositories.NewOrgPageClass;
import Object_Repositories.OrgPageClass;
import Object_Repositories.OrganizationInfoPage;

public class CreateOrganisationWithIndTest 
{
	public static void main(String[] args) throws Throwable 
	{
       WebDriver driver= new ChromeDriver();
       
       WebDriverUtility wdu=new WebDriverUtility(driver);
       
		//To maximize the window
         wdu.maximize();
         wdu.implicitlywait();
         
        PropertyFileUtility pFU = new PropertyFileUtility();
		
		String URL=pFU.readDataFromProprtyFile("url");
		
		String username=pFU.readDataFromProprtyFile("username");
		
		String password=pFU.readDataFromProprtyFile("password");
		
		driver.get(URL);
	
		
		//To Login the application
		
		LoginPageClass lpc=new LoginPageClass(driver);
		
		lpc.login(username, password);
		
		OrgPageClass opc=new OrgPageClass(driver);
		
		opc.organisationButton();
	
		NewOrgPageClass npc= new NewOrgPageClass(driver);
		npc.createOrganisation();
		
		
		//Enter Organization name & Save
	   
		String organisationName="Tharun Inf0 Pvt Ltd"+JavaUtility.generateRanNum();
		npc.orgNameTF(organisationName);
	    npc.industryType(2, driver);
		
		
		npc.sButton();
		 
		OrganizationInfoPage oip=new OrganizationInfoPage(driver);
	
		
		 
		
		  if((oip.orgNameAfterCreation().contains(organisationName)))
			{
		    
			System.out.println("Validated");
			
			}
			else {
				System.out.println("Not validated");
			}
		
		HomePageClass hpc=new HomePageClass(driver);
		
		hpc.signout(driver);
		driver.close();
		
		
		
		
				


	}


}
