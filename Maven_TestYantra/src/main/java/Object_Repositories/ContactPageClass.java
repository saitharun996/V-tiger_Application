package Object_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageClass {
	
	@FindBy(linkText = "Contacts")
	private WebElement contactButton;

	public WebElement getContactButton() {
		return contactButton;
	}
	
	public ContactPageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void  cButton()
	{
		contactButton.click();
	}

}
