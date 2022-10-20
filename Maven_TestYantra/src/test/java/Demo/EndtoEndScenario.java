package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndScenario {

	public static void main(String[] args) 
	{
WebDriver driver= new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To open the application
		
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		//To click on contacts
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on create contact 
		
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		driver.findElement(By.xpath("//option[@value='Mr.']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		String window =driver.getWindowHandle();
		
		
		
		
		
		

	}

}
