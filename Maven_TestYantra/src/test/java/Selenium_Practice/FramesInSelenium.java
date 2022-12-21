package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesInSelenium {

	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://jqueryui.com/droppable/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //page inside another page is known as frame
    
    System.out.println(driver. findElements(By. tagName("iframe")). size());
    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
     WebElement source = driver.findElement(By.id("draggable"));
     WebElement destination = driver.findElement(By.id("droppable"));
    Actions act=new Actions(driver);
    
    act.dragAndDrop(source, destination).build().perform();
    
    driver.switchTo().defaultContent();
    
	}

}
