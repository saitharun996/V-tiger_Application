package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_My_Trip {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		WebElement fromBtn = driver.findElement(By.xpath("//span[text()='From']"));
		fromBtn.click();
		WebElement fromDrp = driver.findElement(By.xpath("//input[type='text']"));
		Select select = new Select(fromDrp);
		select.selectByIndex(1);
//		driver.findElement(By.linkText("From")).click();
//		WebElement formDropdown = driver.findElement(By.linkText("From"));
//		driver.findElement(By.linkText("To")).click();
//		Select s= new Select(formDropdown);
//		s.selectByIndex(1);
//		WebElement toDropdown = driver.findElement(By.linkText("To"));
//		Select s1= new Select(toDropdown);
//		s1.selectByIndex(1);
//		
//		driver.findElement(By.linkText("Search")).click();
		
		

	}

}
