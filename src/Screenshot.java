import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://localhost:8080/login.do");
TakesScreenshot scr=(TakesScreenshot)driver;
File srcF=scr.getScreenshotAs(OutputType.FILE);

File destF=new File("D:/Allconceptshtml/browserScreenshot.png");

FileUtils.copyFile(srcF, destF);
	}

}
