package Object_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutility.WebDriverUtility;

public class NewOrgPageClass {
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	
	private WebElement createOrg;
	
	@FindAll({@FindBy(name="accountname"),@FindBy(className = "detailedViewTextBox")})
	
	private  WebElement orgName;
	
	@FindBy(name="accounttype")
	
	private WebElement indusType;
	
	
	@FindAll({@FindBy(name="button"),@FindBy(xpath = "//input[@type='button']")})
	
	private WebElement saveButton;


	public WebElement getOrgName() {
		return orgName;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	
	public WebElement getCreateOrg() {
		return createOrg;
	}


	public WebElement getIndustryType() {
		return indusType;
	}


	public NewOrgPageClass(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void createOrganisation()
	{
		createOrg.click();
	}
	
	public void orgNameTF(String OrgText)
	{
		orgName.sendKeys(OrgText);
	}
	
	public void industryType(int x, WebDriver driver)
	{
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.SelectByIndex(indusType, x);
	}
	
	public void sButton()
	{
		saveButton.click();
	}
	
	
	
	

}
