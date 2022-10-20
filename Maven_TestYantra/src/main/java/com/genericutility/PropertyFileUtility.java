package com.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {

	public String readDataFromProprtyFile(String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("./CommonData/common1.properties");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		String value = p.getProperty(key);
		return value;
		
		
		

	}

}
