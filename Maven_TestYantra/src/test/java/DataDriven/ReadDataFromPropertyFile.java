package DataDriven;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable
	{
		//Step 1 Convert Properties file to java object
		
		FileInputStream fis=new FileInputStream("./Common.properties");
		
		Properties p=new Properties();
		
		//Step 2 Load java object
		p.load(fis);
		
		//Step 3 Read the data
		
		String value=p.getProperty("url");
		
		System.out.println(value);

	}

}
