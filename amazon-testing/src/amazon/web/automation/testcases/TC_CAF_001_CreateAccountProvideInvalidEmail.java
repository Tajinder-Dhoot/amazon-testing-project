package amazon.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CAF_001_CreateAccountProvideInvalidEmail {
	
	@Test
	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Taj Si");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testapss@gmaaaail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}

}
