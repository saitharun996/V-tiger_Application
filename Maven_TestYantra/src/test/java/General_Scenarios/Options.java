package General_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Options {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new  ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://google.com");
		
		

	}

}
