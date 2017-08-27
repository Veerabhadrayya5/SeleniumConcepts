package webDriverMethods;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleSourcecodeCloseUrl {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en-gb.facebook.com/login/");
			
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
			String pageTitle=driver.getTitle();
			System.out.println(pageTitle);
			
		String sourceCode=	driver.getPageSource();
			System.out.println(sourceCode);
			
			driver.close();
			
		}
	
}
