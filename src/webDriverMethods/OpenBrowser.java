package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		
	}

}
