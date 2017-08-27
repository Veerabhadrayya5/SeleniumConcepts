package FramePopupWindowhandles;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlespart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.id("terms-link")).click();
		
		ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
		
		int numberofwindow=ar.size();
		System.out.println(numberofwindow);
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.linkText("Services")).click();
	driver.switchTo().window(ar.get(0));
	driver.findElement(By.id("email")).sendKeys("salimath");
	/*	Thread.sleep(1000);
		driver.navigate().back();
	*/	
	
	//driver.close();
	driver.quit();
	}

}
