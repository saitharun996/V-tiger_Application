package com.crm.vtiger.testcases3.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyFileUtility;
import com.genericutility.WebDriverUtility;

import Object_Repositories.HomePageClass;
import Object_Repositories.LoginPageClass;
import Object_Repositories.NewOrgPageClass;
import Object_Repositories.OrgPageClass;

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
		
		
		
		LoginPageClass lpc=new LoginPageClass(driver);
		
		lpc.login(username, pwd);
		
		
		OrgPageClass opc=new OrgPageClass(driver);
		
	     opc.organisationButton();
		
	
	     NewOrgPageClass npc= new NewOrgPageClass(driver);
	
	     npc.createOrganisation();
	     
	     String organisationName="Tharun Inf0 Pvt Ltd"+JavaUtility.generateRanNum();
		npc.orgNameTF(organisationName);
		  
		npc.sButton();
		Thread.sleep(3000);

		 HomePageClass hpc=new  HomePageClass(driver);
		 
		 hpc.signout(driver);
		
		driver.close();

	}


}
