package ListAutosuggestAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.google.co.in/");
driver.findElement(By.id("lst-ib")).sendKeys("java");
Thread.sleep(1000);
String xp="//div[contains(text(),'java')]";
List<WebElement> alloption = driver.findElements(By.xpath(xp));

int totalSize = alloption.size();
System.out.println(totalSize);

for(WebElement option:alloption)
{
	String autotext = option.getText();
	System.out.println(autotext);
}


alloption.get(totalSize-1).click();



	}

}
