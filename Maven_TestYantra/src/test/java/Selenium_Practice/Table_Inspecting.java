package Selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Inspecting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));

		/*
		 * for(int i=1;i<table.size();i++) { String tableData =
		 * driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]")).
		 * getText();
		 * 
		 * 
		 * System.out.println(tableData); }
		 */

		List<WebElement> column = driver.findElements(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]"));
		
		for(WebElement c:column)
		{
			System.out.println(c.getText());
		}
	}

}
