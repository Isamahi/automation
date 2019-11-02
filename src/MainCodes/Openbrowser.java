package MainCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	 public  WebDriver driver;
	
	public void openingbrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\elsat\\Desktop\\testngmod\\TNG4Automation\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.navigate().to("https://www.facebook.com");
	}

	
}
