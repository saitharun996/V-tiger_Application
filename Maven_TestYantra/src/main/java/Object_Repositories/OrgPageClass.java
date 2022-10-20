package Object_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPageClass 
{
  @FindBy(linkText = "Organizations")
	private WebElement  orgButton;
  
  public  OrgPageClass(WebDriver driver)
  {
	 
	  PageFactory.initElements(driver, this);
	  
	  
  }

public WebElement getCreateOrg() {
	return orgButton;
}

public void organisationButton()
{
	
	orgButton.click();
}




}
