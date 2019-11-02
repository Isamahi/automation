package FBProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
public WebDriver driver;

@FindBy(id="Forgot account?")
WebElement forgotlink;

public ForgotPasswordPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
 public void forgotclick() {
	 forgotlink.click();
 }

}
