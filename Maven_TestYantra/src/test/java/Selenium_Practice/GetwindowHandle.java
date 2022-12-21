package Selenium_Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetwindowHandle {

	public static void main(String[] args) throws Throwable
	{
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver=new ChromeDriver();
       
       driver.get("http://localhost:8888/index.php?action=index&module=Home");
       Thread.sleep(5000);
       
       driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB.ENTER);
       driver.manage().window().maximize();
       
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.findElement(By.linkText("Organizations")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
       
       Random r=new Random(1000);
       
       
       int num = r.nextInt();
       driver.findElement(By.name("accountname")).sendKeys("VaishnavShreyan2039904"+num);
       driver.findElement(By.xpath("//img[@alt='Select']")).click();
      
       
       Set<String> windowsHandle = driver.getWindowHandles();
       
       
       Iterator<String> iterator = windowsHandle.iterator();
       
       String parent = iterator.next();
       System.out.println(parent);
       String child = iterator.next();
       System.out.println(child);
       driver.switchTo().window(child);
       driver.findElement(By.className("txtBox")).sendKeys("TataProjectsLimited");
       Thread.sleep(3000);
       driver.findElement(By.name("search")).click();
       driver.findElement(By.linkText("TataProjectsLimited")).click();
       Alert alert=driver.switchTo().alert();
       alert.accept();
       
       
       driver.switchTo().window(parent);
       WebElement ele = driver.findElement(By.name("industry"));
       Select s=new Select(ele);
       s.selectByIndex(2);
       Thread.sleep(4000);
       driver.findElement(By.name("button")).click();
       
       driver.findElement(By.name("Edit")).click();
       driver.findElement(By.name("accountname")).clear();
       driver.findElement(By.name("accountname")).sendKeys("VaishnavShreyan89004"+num);
       driver.findElement(By.name("button")).click();
	}

}
