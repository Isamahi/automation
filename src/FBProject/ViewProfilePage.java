package FBProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ViewProfilePage {
public WebDriver driver;

	@FindBy(linkText="Ihab Elsamahi")
WebElement ihabprofile;

public ViewProfilePage() {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void viewprofile() {
	ihabprofile.click();
}
}
