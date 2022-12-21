package Object_Repositories;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutility.BaseClass;

public class ProductPage 
{
	@FindBy(linkText="themes/softed/images/btnL3Add.gif")
	private WebElement addProduct;
	public ProductPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void clickaddProduct()
	{
		addProduct.click();
	}

	

}
