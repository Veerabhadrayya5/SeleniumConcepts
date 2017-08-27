package testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="userA";
		data[0][1]=1234;
		data[1][0]="userB";		
		data[1][1]=5678;
		return data;
	}
	
	@Test(dataProvider="getData")
	public void m1(String un, int pw)
	{
		Reporter.log(un+" "+pw, true);
	}
	
	
}
