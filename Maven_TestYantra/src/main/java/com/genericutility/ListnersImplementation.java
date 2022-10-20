package com.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListnersImplementation implements ITestListener{


		@Override
		public void onTestStart(ITestResult result) {
			
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshot/"+result.getMethod().getMethodName()+".png");
			
			try {
				Files.copy(src, dest);
				
			} catch (IOException  e) {
				
				e.printStackTrace();
			}
			
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		@Override
		public void onStart(ITestContext context) {
			
			
		}

		@Override
		public void onFinish(ITestContext context) {
			
			
		}

	
		

	}


