package TestNGPracticeTest;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.genericutility.BaseClassTest;
import com.genericutility.JavaUtility;
import com.genericutility.ListnersImplementation;

import Object_Repositories.NewOrgPageClass;
import Object_Repositories.OrgPageClass;
@Listeners(ListnersImplementation.class)
public class CreateOrganisationTest extends BaseClassTest
{
	@Test(groups = "regression")
	public void CreateOrg()
	{
		
		OrgPageClass opc=new OrgPageClass(driver);
		
	     opc.organisationButton();
		
	
	     NewOrgPageClass npc= new NewOrgPageClass(driver);
	
	     npc.createOrganisation();
	     
	     String organisationName="Tharun Inf0 Pvt Ltd"+JavaUtility.generateRanNum();
		npc.orgNameTF(organisationName);

	}

}
