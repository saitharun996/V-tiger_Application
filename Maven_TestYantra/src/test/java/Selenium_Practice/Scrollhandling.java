package Selenium_Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.rmi.Remote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollhandling {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new  ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		
		//act.moveToElement(ele).perform();
		act.contextClick(ele).perform();
		
		Robot r=new  Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		//act.dragAndDropBy(ele, 0, 500).perform();
		
		//js.executeScript("window.scrollBy(0,500)");

	}

}
