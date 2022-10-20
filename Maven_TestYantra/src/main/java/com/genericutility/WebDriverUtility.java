package com.genericutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * this method is used to maximize the window
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	//this method is used to wait for page load
	public void implicitlywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//this method is used to selectBy Index   class
	public void SelectByIndex(WebElement ele, int num) {
		Select select=new Select(ele);
		select.selectByIndex(num);
	}
	
	//this method is used to selectBy Vtextisible Text
	public void SelectBYVisibleText(WebElement ele, String Text) {
		Select select=new Select(ele);
		select.selectByVisibleText(Text);
	}
	
	//this method is used for SelectByValue
	public void SelectByValue(WebElement ele, String value) {
		Select select=new Select(ele);
		select.selectByValue(value);
	}
	
	//this method is used for get window handle
	public String getparentHandle() {
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		return parenthandle;
	}
	
	//this method is used for getwindowHandles
	public void allHandles( String pHandle) {
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println("All window Handles are");
		for(String aw : allwindowHandles) {
		System.out.println(aw);
		if(!pHandle.equals(aw)) {
			driver.switchTo().window(aw);
			break;
		}
		else
		{
			driver.switchTo().window(pHandle); 
		}
		}
		
		
		
			
		}
		
		//this method is used for mouseOver action
		public void mouseoverAction(WebElement variable) {
			Actions action=new Actions(driver);
			action.moveToElement(variable).perform();
		}
		
		}


