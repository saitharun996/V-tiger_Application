package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) throws Throwable {
     
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		
		driver.switchTo().frame("frame-right");
		
		String frameRight = driver.findElement(By.name("frame-right")).getText();
		
		System.out.println(frameRight);
		
	}

}
