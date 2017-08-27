package ListAutosuggestAction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListExample {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Allconceptshtml/List.html");
		WebElement list = driver.findElement(By.name("slv"));
		Select s = new Select(list);
		List<WebElement> allOptions = s.getOptions();
	//	TreeSet<String> allText = new TreeSet<String>();
		HashSet<String> allText=new HashSet<String>();
		int count = allOptions.size();
		for (int i = 0; i < count; i++) {
			WebElement options = allOptions.get(i);
			String text = options.getText();

	//		System.out.println(text);
		//	allText.add(text);
if(!allText.add(text))
{
	System.out.println(text);
}
		}
	/*	for (String text : allText) {
			System.out.println(text);
		}
*/
		// s.selectByVisibleText("dosa");

	}
}
