package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsuranceApp_ToAdd_NewClient {

	public static void main(String[] args) throws Throwable 
	{
      WebDriverManager.chromedriver().setup();
      
       WebDriver driver=new ChromeDriver();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/index.php");
       Thread.sleep(3000);
   
       driver.findElement(By.name("username")).sendKeys("555",Keys.TAB,"666",Keys.ENTER);
       driver.findElement(By.linkText("CLIENTS")).click();
       driver.findElement(By.xpath("//a[@class='btn']")).click();
       
       //Client ID
       driver.findElement(By.name("client_id")).sendKeys("SaiTharun0121");
       
       //Client Password
       driver.findElement(By.name("client_password")).sendKeys("Sai@12345");
       
       //Name
      driver.findElement(By.name("name")).sendKeys("Raja");
      
      //Image(uploading  Image)
      
      //Gender
      driver.findElement(By.name("sex")).sendKeys("Male");
      
      //Date of birth
      driver.findElement(By.name("birth_date")).sendKeys("11-09-1999");
      
      //Marital Status
      driver.findElement(By.name("maritial_status")).sendKeys("Single");
      
      //National ID
      driver.findElement(By.name("nid")).sendKeys("123467576576");
      
      //phone
      driver.findElement(By.name("phone")).sendKeys("7396088117");
      
      //Address
      driver.findElement(By.name("address")).sendKeys("1-234-890, Nagole,Hyderabad");
      
      //Policy ID
      driver.findElement(By.name("policy_id")).sendKeys("SDET12");
      
      //Nominee Name
      driver.findElement(By.name("nominee_name")).sendKeys("Rajasekhar");
      
      //GENDER
      driver.findElement(By.name("nominee_sex")).sendKeys("Male");
      
      //Birth Date
      driver.findElement(By.name("nominee_birth_date")).sendKeys("17-07-1980");
      
      //National ID
      driver.findElement(By.name("nominee_nid")).sendKeys("13435445245");
      
      //Relationship
      driver.findElement(By.name("nominee_relationship")).sendKeys("Married");
      
      //Priority
      driver.findElement(By.name("priority")).sendKeys("medium");
      
      //Phone
      driver.findElement(By.name("nominee_phone")).sendKeys("792782728");
      
      //Submit
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      
      
      
	}

}
