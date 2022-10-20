package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenario_2 {

	public static void main(String[] args)
	{
      WebDriver driver= new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To open the application
		
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		
		//To Login the application
		
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		//To click on Organization module
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		//To click on add organization Icon
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//Enter Organization name & Save
		
		driver.findElement(By.name("accountname")).sendKeys("TestYantraSoftwareSolutions");
		
		driver.findElement(By.xpath("//select[@name='accounttype']/option/following-sibling::option")).click();
		
		driver.findElement(By.name("button")).click();
		
		


}


	}


