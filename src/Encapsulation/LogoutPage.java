package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
@FindBy(xpath="//a[contains(.,'Logout')]")
private WebElement logoutBTN;

public LogoutPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
	

public void setLogoutclick()
{
	logoutBTN.click();
}

}
