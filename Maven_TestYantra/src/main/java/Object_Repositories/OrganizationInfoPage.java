package Object_Repositories;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage 
{
	@FindBy(className = "dvHeaderText")
	private WebElement orgNameAfterCreation;

	public WebElement getOrgNameAfterCreation() {
		return orgNameAfterCreation;
	}
	
	public OrganizationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	
	public String orgNameAfterCreation()
	{
		return orgNameAfterCreation.getText();
	}
}
