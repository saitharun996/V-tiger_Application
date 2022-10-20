package Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateConWithOrgNameTest 
{
	public static void main(String[] args) throws Throwable 
	{
	
		WebDriver driver= new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//To open the application
		
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
		contact.click();
		
		WebElement newContact = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		newContact.click();
		
		WebElement name = driver.findElement(By.name("salutationtype"));
		
		Select select=new Select(name);
		
		select.selectByValue("Mr.");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.sendKeys("Sai");
		
        WebElement lastname = driver.findElement(By.name("lastname"));
		
        lastname.sendKeys("Tharun");

        WebElement orgName = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
		
        orgName.click();
        
        String parentWindow=driver.getWindowHandle();
        
        Set<String> allwindows = driver.getWindowHandles();
        
        for(String allWindow:allwindows)
        	
        {
        	driver.switchTo().window(allWindow);
        	System.out.println(allWindow);
        }
        
        WebElement orgnamesearch = driver.findElement(By.name("search_text"));
        orgnamesearch.sendKeys("TataProjectsLimited");
        
        WebElement selectOrgName = driver.findElement(By.name("search_field"));
        
        Select select1=new Select(selectOrgName);
        select1.selectByVisibleText("Organization Name");
        
        WebElement searchButton = driver.findElement(By.name("search"));
        
        searchButton.click();
        
        WebElement selectName = driver.findElement(By.linkText("TataProjectsLimited"));
        
        selectName.click();
        
        driver.switchTo().window(parentWindow);
        
        WebElement saveButton = driver.findElement(By.name("button"));
        saveButton.click();
        Thread.sleep(4000);
        
		  WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		  
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.close();
        
        
        }
		
		
	



}
