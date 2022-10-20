package TestNGPracticeTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.genericutility.BaseClass;
import com.genericutility.ExcelFileUtility;
import com.genericutility.ListnersImplementation;
import com.genericutility.WebDriverUtility;

import Object_Repositories.ContactPageClass;
import Object_Repositories.NewContactPageClass;

@Listeners(ListnersImplementation.class)

public class CreateConWithOrgNameTest extends BaseClass
{
	@Test(groups = "smoke")
	public void CreateConWithOrg() throws Throwable 
	{ 
	
	WebDriverUtility wDU=new WebDriverUtility(driver);
	
	
	ExcelFileUtility efu=new ExcelFileUtility();
	 
	 String fName = efu.readDataFromExcelFile("Sheet1", 7, 2);
	 String lName = efu.readDataFromExcelFile("Sheet1", 7, 3);
	 String orgname = efu.readDataFromExcelFile("Sheet1", 7, 4);
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
    	
	}


}
