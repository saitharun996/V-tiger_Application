package com.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListnersImplementation implements ITestListener{
        
	    ExtentTest test;
	    ExtentReports reports;

		@Override
		public void onTestStart(ITestResult result) {
			
			test=reports.createTest(result.getMethod().getMethodName());
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
			test.log(Status.PASS, result.getMethod().getMethodName()+" got passed");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			
			String path = BaseClassTest.takesScreenshot(result.getMethod().getMethodName());
			test.log(Status.FAIL, result.getMethod().getMethodName()+ " got Failed" );
			test.log(Status.FAIL, result.getThrowable());

			test.addScreenCaptureFromPath(path);
			} 
		
			
		

		@Override
		public void onTestSkipped(ITestResult result) {
			
			test.log(Status.SKIP, result.getMethod().getMethodName()+ " got Skipped" );
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		@Override
		public void onStart(ITestContext context) {
			ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReport/Vtiger.html");
			reporter.config().setDocumentTitle("V-tiger");
			reporter.config().setTheme(Theme.STANDARD);
			
			reports=new ExtentReports();
			reports.attachReporter(reporter);
			
			reports.setSystemInfo("Browser", "Chrome");
			reports.setSystemInfo("Build", "10.3.5");
			reports.setSystemInfo("Reporter Name", "Pavan");
			reports.setSystemInfo("Env", "QA");
			
		}

		@Override
		public void onFinish(ITestContext context) {
			
			reports.flush();
			
		}

	
		

	}


