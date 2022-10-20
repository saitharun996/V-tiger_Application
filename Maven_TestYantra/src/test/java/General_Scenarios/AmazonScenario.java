package General_Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.genericutility.WebDriverUtility;

public class AmazonScenario {

	public static void main(String[] args) throws Throwable 
	{

		WebDriver driver= new ChromeDriver();
		
		WebDriverUtility wDU=new WebDriverUtility(driver);
		
		wDU.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//For Mobile
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		
	
		Actions act=new Actions(driver);
		
		act.contextClick(mobiles).perform();
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		//For Todays Deals
				WebElement TD = driver.findElement(By.linkText("Today's Deals"));
				act.contextClick(TD).perform();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
			Thread.sleep(4000);
				
				
	// For  books
				WebElement book = driver.findElement(By.linkText("Books"));
				act.contextClick(book).perform();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				
				
	String parent=driver.getWindowHandle();
	
	//System.out.println(parent);
	
	 Set<String> allID = driver.getWindowHandles();
	 
	 String switchTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	 for(String allIDs:allID )
	 {
		String title = driver.switchTo().window(allIDs).getTitle();
		System.out.println(title);
		
		if(title.equals(switchTitle))
		{
			break;
			
		}
		
		if(driver.findElement(By.id("searchDropdownBox")).isDisplayed())
		{
			System.out.println("Control in the mobile");
		}
		 
	 }
	 
	
	 
	 }
		
		
	
	
		
		
		

	}


