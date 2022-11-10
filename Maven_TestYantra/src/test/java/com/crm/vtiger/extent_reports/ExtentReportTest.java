package com.crm.vtiger.extent_reports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTest
{
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	@Test
	public void createReport() throws Throwable
	{
		reporter=new ExtentSparkReporter("./Maven_TestYantra/ExtentReports/SDETREPORT1.html");
		
		reporter.config().setDocumentTitle("Instagram");
		reporter.config().setTheme(Theme.STANDARD);
		
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Build", "3.4");
		reports.setSystemInfo("Reporter name", "saiTharun");
		reports.setSystemInfo("environment", "testing");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("httP://facebook.com");
		
		test=reports.createTest("FB2");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="./Screenshot/fb2.png";
		File dest= new File(path);
		Files.copy(src, dest);
		test.addScreenCaptureFromPath(path);
		
		reports.flush();
		
	}

}
