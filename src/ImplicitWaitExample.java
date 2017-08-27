import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitExample {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://localhost:8080/login.do");
driver.findElement(By.id("username")).sendKeys("admin");

driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
		
String name=driver.getTitle();
System.out.println(name);
/*
WebDriverWait wait=WebDriverWait(driver,5);
wait.until(ExpectedCondition.ImplicitWaitExample("track"));
*/



	}

}
