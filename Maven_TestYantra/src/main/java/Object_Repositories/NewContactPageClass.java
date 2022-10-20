package Object_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutility.FakerUtility;
import com.genericutility.WebDriverUtility;

public class NewContactPageClass 
{
	private static final String xpath = null;



	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']" )
	private WebElement newContactIcon;
	
	
	
	@FindBy(name="salutationtype")
	private WebElement termToRespect;
	
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement orgButton;
	
	@FindBy(name="search_text")
	private WebElement orgnameSearch;
	
	@FindBy(name="search_field")
	private WebElement selectOrgName;
	
	@FindBy(name="search")
	private WebElement orgsButton;
	
	@FindBy(linkText = "Organization Name")
	private WebElement selectName;
	
	
	public WebElement getSelectName() {
		return selectName;
	}



	public WebElement getOrgsButton() {
		return orgsButton;
	}


	public WebElement getSelectOrgName() {
		return selectOrgName;
	}



	public WebElement getOrgSearch() {
		return orgnameSearch;
	}


	public WebElement getOrgButton() {
		return orgButton;
	}

	public WebElement getNewContactIcon() {
		return newContactIcon;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	public WebElement getTermToRespect() {
		return termToRespect;
	}
	
	public NewContactPageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NewContactButton()
	{
		newContactIcon.click();
	
	}
	WebDriver driver=new ChromeDriver();
	WebDriverUtility wdu=new WebDriverUtility(driver);
	public void RespectTerm(WebElement ele,int x)
	{
		wdu.SelectByIndex(ele, x);
	}
	
	public void Name(String firstname, String lastname)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
	}
	
	public void organButton() {
		orgButton.click();
	}
	
	public void OrgNameSearch(String orgname)
	{
		orgnameSearch.sendKeys(orgname);
	}
	
	public void orgSelect()
	{
		selectOrgName.sendKeys("Organization Name");
		
		
	}
	
	public void orgNameSearchButton()
	{
		orgsButton.click();
	}
	
	public void selectNameOrg()
	{
		selectName.click();
	}
	
	public void sButton()
	{
		saveButton.click();
	}
	
	
	
	
	
	
	

}
