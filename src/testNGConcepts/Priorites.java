package testNGConcepts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Priorites {

	@Test(priority=1, enabled=false)
	public void m1()
	{
		Reporter.log("hi",true);
	//Assert.fail();
	}
	
	@Test(priority=2, dependsOnMethods={"m1"})
	public void m2()
	{
		Reporter.log("hellow",true);
	}
	
	
	
	
}
