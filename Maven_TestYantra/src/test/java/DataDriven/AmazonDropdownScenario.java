package DataDriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropdownScenario {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		//To open the URL
		
		driver.get("https://www.amazon.com/");
		
		
		List<WebElement> ele= driver.findElements(By.name("url"));
		
		for(WebElement ele1:ele)
		{
			String list=ele1.getText();
			System.out.println(list);
		}
		
		driver.findElement(By.xpath("//select[@name='url']/option[2]")).click();

	}

}
