package amazon.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class InstanciateDriver {
	
	public WebDriver driver = null;
	public Actions action = null;
	@BeforeMethod
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		
		action = new Actions(driver);
	}
	
}

