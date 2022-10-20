package General_Scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InTableForParticular_Column_Row {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverUtility wdu=new WebDriverUtility(driver);
		
		driver.get("https://www.icc-cricket.com/homepage");
		
		driver.findElement(By.xpath("//button[normalize-space()='Rankings' and @class='linked-list__dropdown-label js-dropdown-btn']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Team Rankings']")).click();
		
		System.out.println("The list rows for particular column");
		//For particular Column
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		 
		 for (int i = 1; i <=rows.size(); i++) 
		 {
			 for (int j = 1; j<=1; j++) 
			 {
				 String data = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td[2]")).getText();//tr-row & td-column
				
				System.out.print(data+" ");
			}
			 System.out.println();
			
		}
		 
		 
		 System.out.println("The list columns for particular row");
		//For particular row
			
			//List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
			 
			 for (int i = 1; i <=1; i++) 
			 {
				 for (int j = 1; j<=5; j++) 
				 {
					 String data = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[2]/td["+j+"]")).getText();//tr-row & td-column
					
					System.out.print(data+" ");
				}
				 System.out.println();
				
			}
		
	

	}

}
