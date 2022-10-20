package DataDriven;

import org.testng.annotations.Test;

public class ReadDataFromCommandPromptTest {

	@Test
	public  void readDataFromCMDTest() 
	{
		String URL=System.getProperty("url");
		
		String UN=System.getProperty("un");
		
		
		System.out.println("=========="+URL); 
		System.out.println("=========="+UN);

	}

}
