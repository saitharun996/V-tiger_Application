package Object_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass 
{
	@FindBy(linkText = "Organizations")
	
	private WebElement orgButton;
	
	@FindBy(linkText = "Contacts")
	
	private WebElement contactsButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	
	private WebElement adminImg;
	
	@FindBy(linkText = "Sign Out")
	
	private WebElement signOutButton;

	public WebElement getOrgButton() {
		return orgButton;
	}

	public WebElement getContactsButton() {
		return contactsButton;
	}

	public WebElement getConButton() {
		return adminImg;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	public HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public  void signout(WebDriver driver)
	{
		Actions act = new Actions(driver);
		
		
		act.moveToElement(adminImg).perform();
		
		signOutButton.click();
	}
	
	

}
