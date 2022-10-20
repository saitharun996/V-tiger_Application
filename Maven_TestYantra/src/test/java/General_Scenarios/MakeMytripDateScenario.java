package General_Scenarios;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytripDateScenario {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverUtility wdu=new WebDriverUtility(driver);
		
		wdu.maximize();
		wdu.implicitlywait();
		
		driver.get("https://www.makemytrip.com/");
		
		Date date=new Date();
		
		String d=date.toString();
		
		System.out.println(d);
		
		String[] arr = d.split(" ");
		
		String day = arr[0];
		String month = arr[1];
		String date1 = arr[2];
		String year = arr[5];
		
		String todaydate = day+" "+month+" "+date1+" "+year;
		//System.out.println(day+" "+month+" "+date1+" "+year);
		//System.out.println(todaydate);
		
		driver.findElement(By.className("langCardClose")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+todaydate+"']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		

	}

}
