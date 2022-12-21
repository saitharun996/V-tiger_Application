package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_handling {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.com");
		
		Actions act=new Actions(driver);
		
//	WebElement ele = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		//act.moveToElement(ele).perform();
//		act.contextClick(ele).perform();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=543400653695171157&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062145&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=EAIaIQobChMIkfb8zI20-wIVTQ8rCh2ZTgbjEAAYASAAEgKYrfD_BwE");
          WebElement ele1 = driver.findElement(By.className("nav-a"));
          ele1.click();
          Thread.sleep(3000);
		act.dragAndDropBy(ele1, 0, 500).perform();
	}

}
