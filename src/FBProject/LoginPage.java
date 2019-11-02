package FBProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(id="email")
    WebElement emailfield;
	
	@FindBy(id="pass")
    WebElement passwordfield;
	
	@FindBy(id="loginbutton")
	WebElement login;
	
	@FindBy(linkText="Forgot account?")
	WebElement forgotaccount;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enteremail(String email) {
	emailfield.sendKeys(email);	
	}
	public void enterpassword(String pass) {
		passwordfield.sendKeys(pass);
	}
	public void clicklogin() {
		login.click();
	}
	public void forgotclick() {
		forgotaccount.click();
	}
}
