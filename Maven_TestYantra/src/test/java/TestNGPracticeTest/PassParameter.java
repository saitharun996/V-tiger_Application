package TestNGPracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassParameter {
    @Parameters("url")
	@Test
	public void gmailApp(String url) 
	{
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
	}

}
