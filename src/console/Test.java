package console;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://console.unbxd.com/unbxdlogin");
		LoginPage lp = new LoginPage(driver);
		lp.setLoginclick();
		Thread.sleep(5000);
		EmailPwdPage ep = new EmailPwdPage(driver);
		ep.setEmail("veerabhadrayya.s@unbxd.com");
		Thread.sleep(2000);
		ep.setClickNext();
		Thread.sleep(1000);/*
		Password p=new Password(driver);*/
		ep.setpwd("veerabhadrayya@@5");
		Thread.sleep(2000);
		ep.setClickNext();

	}

}
