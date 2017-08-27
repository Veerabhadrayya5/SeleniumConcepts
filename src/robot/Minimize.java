package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
static
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
}
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(1000);	
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ALT);
	
		
		r.keyRelease(KeyEvent.VK_SPACE);
		
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_N);
Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_N);

		
		
		
		
	}

}
