package DataDriven;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXmlFileTest 
{
	
	@Test
	public void readDataFromTest(XmlTest xml)
	{
		String URL=xml.getParameter("url");
		System.out.println(URL);
		
		String userName=xml.getParameter("username");
		System.out.println(userName);
		
		String password=xml.getParameter("password");
		System.out.println(password);
	}

}
