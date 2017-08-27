package ListAutosuggestAction;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DropDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.actimind.com/");
		Actions action=new Actions(driver);
		
		WebElement menu = driver.findElement(By.xpath("//span[contains(.,'About Company')]"));
		
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Competitive Advantages")).click();
		
	}

}
