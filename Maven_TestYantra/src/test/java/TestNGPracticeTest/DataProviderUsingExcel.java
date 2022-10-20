package TestNGPracticeTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.genericutility.ExcelFileUtility;

public class DataProviderUsingExcel {

	@Test(dataProvider="excelData")
	public void getcred(String un,String pwd)
	{
		System.out.println(un+" "+pwd);
		
	}
		@DataProvider
		public Object[][] excelData() throws Throwable
		{
			Object arr[][]=new Object[4][2];
			
			ExcelFileUtility  efu= new ExcelFileUtility();
			
			for (int i = 0; i <=efu.getLastRowCount("Sheet2"); i++) 
			{
				arr[i][0]=efu.readDataFromExcelFile("Sheet2", i, 0);
				arr[i][1]=efu.readDataFromExcelFile("Sheet2", i, 1);
				
				
			}
			return arr;
			
			
		}
		

	}


