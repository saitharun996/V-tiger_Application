package General_Scenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LenskartScenario_Tooltip {

	public static void main(String[] args) throws Throwable
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.lenskart.com/");
		//String titleName = driver.findElement(By.className("getGaData")).getAttribute("title");
		//System.out.println(titleName);
		
		driver.findElement(By.name("q")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li/a"));
        
		
		Thread.sleep(3000);
		for (int i = 0; i < ele.size(); i++) 
		{
			String ele2=ele.get(i).getText();
			
			System.out.println(ele2);
			
		}
	}

}
