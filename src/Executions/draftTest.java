package Executions;

import org.testng.annotations.Test;

import FBProject.LoginPage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class draftTest {
	public WebDriver driver;

	@Test
  public void f() {
	  LoginPage login=new LoginPage(driver);
		
		
		//login.enteremail("zag65@yahoo.com");
		//login.enterpassword("MoMo1234");
		//login.clicklogin();
		//login.forgotclick();
	}
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\elsat\\Desktop\\testngmod\\TNG4Automation\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.navigate().to("https://www.facebook.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
