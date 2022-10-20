package DataDriven;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

public class ReadDataFromJson {

	public static void main(String[] args) throws Throwable 
	{
	 //Step 1 Convert JSON File into  JSON object
		
		FileReader fr=new FileReader("./JsonFile.json");
		
		//Step 2 Convert Json Object into Java Object
	    
		JSONParser jp=new JSONParser();
		
		Object jobj=jp.parse(fr);
		
		//Step 3 Use Hashmap to read data
		
		HashMap hp=(HashMap)jobj;
		
		String value=(String) hp.get("url");
		
		System.out.println(value);
		
	
		
		

	}

}
