package testNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertFunctions {
	
@BeforeSuite
public void setproperty()
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@Test
	public void mm()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8080/login.do");
		String actual=driver.getTitle();
	String expected="actiTIME- Login";
	SoftAssert sa=new SoftAssert();
			
			sa.assertEquals(actual, expected);
	
			
			
			Reporter.log("hi",true);
			sa.assertAll();
	
	}
	
	
}
