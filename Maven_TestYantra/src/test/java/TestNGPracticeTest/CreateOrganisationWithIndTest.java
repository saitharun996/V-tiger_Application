package TestNGPracticeTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.genericutility.BaseClass;
import com.genericutility.BaseClassTest;
import com.genericutility.JavaUtility;
import com.genericutility.ListnersImplementation;
import com.genericutility.PropertyFileUtility;
import com.genericutility.WebDriverUtility;

import Object_Repositories.HomePageClass;
import Object_Repositories.LoginPageClass;
import Object_Repositories.NewOrgPageClass;
import Object_Repositories.OrgPageClass;
import Object_Repositories.OrganizationInfoPage;

@Listeners(ListnersImplementation.class)

public class CreateOrganisationWithIndTest extends BaseClassTest
{
	@Test(groups = "smoke")
	public void CreateOrgWithTest() throws Throwable
	{
      	OrgPageClass opc=new OrgPageClass(driver);
		
		opc.organisationButton();
	
		NewOrgPageClass npc= new NewOrgPageClass(driver);
		npc.createOrganisation();
		
		
		//Enter Organization name & Save
	   
		String organisationName="Tharun Inf0 Pvt Ltd"+JavaUtility.generateRanNum();
		npc.orgNameTF(organisationName);
	    npc.industryType(2, driver);
		
		
		npc.sButton();
		 
		//OrganizationInfoPage oip=new OrganizationInfoPage(driver);
		Thread.sleep(4000);
	
		//Assert.assertEquals(organisationName, oip.orgNameAfterCreation());
		
		
	 //use split method	
		
		
		
		
				


	}


}
