package Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRepositoryTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/login.do");
		LoginRepository lr = new LoginRepository(driver);
		lr.setUserName("admin");
		lr.setpwd("manager");
		lr.setclick();

	//	Thread.sleep(2000);
	//	lr.setclicklogout();
	//	driver.navigate().refresh();
			}

}
