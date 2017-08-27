package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRepository {

	private WebElement useNameTXB;

	private WebElement pwdTXB;
	private WebElement loginBTN;
//	private WebElement logoutBTN;

	public LoginRepository(WebDriver driver)

	{
		useNameTXB = driver.findElement(By.name("username"));
		pwdTXB = driver.findElement(By.name("pwd"));
		loginBTN = driver.findElement(By.id("loginButton"));
	//	logoutBTN = driver.findElement(By.xpath("//a[contains(.,'Logout')]"));
	}

	public void setUserName(String un) {
		useNameTXB.sendKeys(un);
	}

	public void setpwd(String pd) {
		pwdTXB.sendKeys(pd);
	}

	public void setclick() {
		loginBTN.click();
	}

	/*public void setclicklogout()

	{
		logoutBTN.click();
	}
*/
}
