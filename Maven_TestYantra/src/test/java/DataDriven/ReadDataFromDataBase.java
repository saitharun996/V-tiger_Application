package DataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class ReadDataFromDataBase 
{
	
	@Test
	
	public void ReadDataTest() throws Throwable
	{
		
	//Step-2 Connect to Database
	Connection con=null;
	try {
		//Step-1 Register the driver
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		// Step 3 create Statement
		Statement stat=con.createStatement();
		
		//Step 4 Execute Query
		ResultSet result=stat.executeQuery("select * from students_info;");
		
		while(result.next())
		{
			System.out.println(result.getString(1)+"  "+result.getString(2));
		}
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
		//Step 5 close connection with Database
	}
		finally {
			
		con.close();
	System.out.println("Connection closed");
		}
	}
	}
	
	

