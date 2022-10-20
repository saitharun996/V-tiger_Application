package TestNGPracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericutility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon
{
	static WebDriver driver;
  @Test
  public void amazon()
  {
	  driver=new ChromeDriver();
	  WebDriverManager.chromedriver().setup();
	  
	  driver.get("https://amazon.com");
	  
	  System.out.println(driver.getTitle());
	  
	  Assert.assertEquals(false, false);
  }
}
