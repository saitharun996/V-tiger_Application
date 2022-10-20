package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoLoginScenario {

	public static void main(String[] args) throws Throwable
	{
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//To open the application
		
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		//To click on Organization module
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		//To click on add organization Icon
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//Enter Organization name & Save
		
		String organisationName="Tharun Inf0 Pvt Ltd303";
		WebElement accountName = driver.findElement(By.name("accountname"));
		accountName.sendKeys(organisationName);
		  
		driver.findElement(By.name("button")).click();
		 
		 String orgNameAfterCreation=driver.findElement(By.className("dvHeaderText")).getText();
		 
		 
		 
		  
		  
		  if((orgNameAfterCreation.contains(organisationName)))
			{
		    
			System.out.println("Validated");
			
			}
			else {
				System.out.println("Not validated");
			}
		
		
		
		
		  WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		  
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		 
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.close();
		
		
		
		
	}
}
		
		

