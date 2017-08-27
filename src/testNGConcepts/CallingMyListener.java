package testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListeners.class)
public class CallingMyListener {
@Test
public void TestA()
{
	Reporter.log("Successful",true);
}
	
	
}
