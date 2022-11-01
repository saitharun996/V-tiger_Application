package com.crm.vtiger.extent_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTest
{
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	@Test
	public void createReport()
	{
		reporter=new ExtentSparkReporter("./Maven_TestYantra/ExtentReports/SDETREPORT.html");
		
		reporter.config().setDocumentTitle("Instagram");
		reporter.config().setTheme(Theme.DARK);
		
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Build", "3.4");
		reports.setSystemInfo("Reporter name", "saiTharun");
		reports.setSystemInfo("environment", "testing");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("httP://facebook.com");
		
		test=reports.createTest("FB1");
		
		reports.flush();
		
	}

}
