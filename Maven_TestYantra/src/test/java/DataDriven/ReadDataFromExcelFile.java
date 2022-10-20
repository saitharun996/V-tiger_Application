package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile 
{
    @Test
	public void readDataFromExcel() throws Throwable 
	{
		FileInputStream fis =new FileInputStream("./Common.xlsx");
		
		
		Workbook book=WorkbookFactory.create(fis);
		
	    String url=book.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    
	    String username=book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	    
	    String password=book.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	    
	    System.out.println(url);
	    System.out.println(username);
	    System.out.println(password);
		
		

	}

}
