package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByLoginRepositoryPage {
@FindBy(name="username")
	private WebElement useNameTXB;
@FindBy(name="pwd")

	private WebElement pwdTXB;
@FindBy(id="loginButton")
	
private WebElement loginBTN;
//	private WebElement logoutBTN;

	public FindByLoginRepositoryPage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
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
