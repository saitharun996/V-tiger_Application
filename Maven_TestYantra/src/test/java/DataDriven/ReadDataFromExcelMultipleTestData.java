package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelMultipleTestData {

	public static void main(String[] args) throws Throwable
	{
		
	  DataFormatter df=new  DataFormatter();
		FileInputStream fis=new FileInputStream("./EmployeeDetails.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
	int lastrow=sh.getLastRowNum();
	
	//All the employee names
	for(int i=1;i<=lastrow;i++)
	{
		
		String value=sh.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		
		
	}
	
	//Salary more than 35000
	
	System.out.println("The salary more than 3500 members are");
	
	for (int i = 1; i < lastrow; i++) 
	{
		
		int sal=(int) sh.getRow(i).getCell(3).getNumericCellValue();
		
		if(sal>35000)
		{
			String name=sh.getRow(i).getCell(1).getStringCellValue();
			
			
			
			System.out.println(name);
		}
		}
	
	// list of members in QA
	
	System.out.println("The list of members in QA");
	
	for (int i = 1; i < lastrow; i++) 
	{
		String dept=sh.getRow(i).getCell(2).getStringCellValue();
		
		if(dept.equalsIgnoreCase("QA"))
		{
          String name=sh.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println(name);
		}
		
	}

	}
	
		

	}


