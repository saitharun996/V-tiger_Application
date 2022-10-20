package DataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class InsertTheDataIntoDataBaseTest 
{
	@Test
	public void insertDataintoDatabase() throws Throwable
	{
		Connection con = null;
		try {
			//Step -1 Register the driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			//Step2 connect to Database
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			
			//Step 3 create statement
			Statement stat=con.createStatement();
			
			int result=stat.executeUpdate("insert into students_info(regno, firstname,middlename,lastname) values(4,'sai','tharun','h');");
			
			
			if(result==1)
			{
				System.out.println("Data is stored");
			}
			
			else
			{
				System.out.println("Data is not stored");
			}
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
		
		
		con.close();
		
		System.out.println("Connection closed");
		}
		
		
		
	}

}
