package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hardcoding {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("saitharunannela@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sxdimkdmx");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search Facebook']")).sendKeys("saitharun");
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']/..")).click();
		
		
		
       
	}

}
