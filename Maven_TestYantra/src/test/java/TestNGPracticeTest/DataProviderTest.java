package TestNGPracticeTest;

import javax.sound.sampled.TargetDataLine;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider ="getData")
	
	public  void bookTicket(String src,String dest)
	{
		System.out.println(src+" "+dest+" ");
	}

	@DataProvider
	public  Object[][] getData()
	{
		Object arr[][]=new Object [3][2];
		
		arr[0][0]="BLR";
		arr[0][1]="HYD";
		arr[1][0]="DEL";
		arr[1][1]="PUNE";
		arr[2][0]="MUM";
		arr[2][1]="CHE";
		
		return arr;
		}

	}


