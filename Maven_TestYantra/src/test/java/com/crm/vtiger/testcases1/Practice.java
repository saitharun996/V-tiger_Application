package com.crm.vtiger.testcases1;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args)
	{
     int a[]= {1,33,5,6,7};
     
     for(int i=0;i<a.length;i++)
     {
    	for(int j=0;j<a.length;j++)
    	{
    		if(a[i]<a[j])
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    			
    			
    			
    			System.out.println(a[i]);
    		}
    		
    	}
    	
     }
     
     
      
      
	}

}
