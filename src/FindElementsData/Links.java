package FindElementsData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Allconceptshtml/findelementslink.html");
	List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
	for(WebElement td:alllink)
	{
		String text1 = td.getText();
		System.out.println(text1);
	}
	
	
		/*int totallink = alllink.size();
		System.out.println(totallink);
	
	String text = alllink.get(0).getText();
	System.out.println(text);
	*/
	}

}
