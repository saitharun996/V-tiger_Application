package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_1 {

	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement ele=driver.findElement(By.cssSelector("[title='Earrings']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		driver.findElement(By.cssSelector("[title='Rings']")).click();
		
		List<WebElement> ele1=driver.findElements(By.xpath("//span[contains(@class,'p-wrap')]"));
		
        for(WebElement ele2:ele1)
        {
        	String data=ele2.getText();
        	
        	System.out.println(data);
        	System.out.println();
        	
        }
        }

	}


