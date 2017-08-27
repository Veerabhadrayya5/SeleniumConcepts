package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	static

	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//	driver.navigate().to("http://localhost:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

			String homepage=driver.getCurrentUrl();
			System.out.println(homepage);
Thread.sleep(1000);
			driver.navigate().back();
		String loginpage=driver.getCurrentUrl();
		System.out.println(loginpage);
		// driver.close();
		
		
		

	}

}
