package Object_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass 
{
	@FindBy(name="user_name")
	private WebElement userName;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	
	public LoginPageClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public WebElement getUserName() {
		return userName;
	}


		public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}

    public void login(String UserNameText, String passwordText) {
    	
    	userName.sendKeys(UserNameText);
    	password.sendKeys(passwordText);
		loginButton.click();
		
		
		
	}
	
	
	

}
