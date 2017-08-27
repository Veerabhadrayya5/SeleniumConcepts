package testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameters {
@org.testng.annotations.Parameters({"city","area"})
	@Test
	public void citydata(String c, String a)
	{
		Reporter.log(c+a,true);
	}
	
	
}
