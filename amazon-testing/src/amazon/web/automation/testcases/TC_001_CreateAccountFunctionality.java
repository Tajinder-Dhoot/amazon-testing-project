package amazon.web.automation.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import amazon.web.automation.base.InstanciateDriver;
import amazon.web.automation.utilities.PropertyReader;

public class TC_001_CreateAccountFunctionality extends InstanciateDriver{
	
	@Test
	public void tc_CAF_002_Provide_No_Fields() throws IOException {
		
		
		
		WebElement element = driver.findElement(By.xpath
				(PropertyReader.readElementLocator("hello_sign_in_tab_xpath")));
		action.moveToElement(element, 5, 5).perform();
		pageAction.clickButton(driver.findElement(By.xpath
				(PropertyReader.readElementLocator("start_here_button_xpath"))));
		account.enterEmptyYourName();
		account.enterEmptyEmail();
		account.enterEmptyPassword();
		account.enterEmptyPasswordAgain();
		account.clickCreateAccountButton();
	}
	
	@Test
	public void tc_CAF_003_Provide_No_Name() throws IOException {
		
		
		WebElement element = driver.findElement(By.xpath
				(PropertyReader.readElementLocator("hello_sign_in_tab_xpath")));
		action.moveToElement(element, 5, 5).perform();
		pageAction.clickButton(driver.findElement(By.xpath
				(PropertyReader.readElementLocator("start_here_button_xpath"))));
		account.enterEmptyYourName();
		account.entervalidEmail();
		account.enterValidPassword();
		account.enterValidPasswordAgain();
		account.clickCreateAccountButton();
	}

	/*@Test
	public void tc_CAF_004_Provide_No_Email() {
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Tajinder Singh");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	
	@Test
	public void tc_CAF_005_Empty_Password_Non_Empty_Password_Again() {
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Tajinder Singh");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testapps.demo123@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@Test
	public void tc_CAF_006_Non_Empty_password_Empty_Password_Again() {
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Tajinder Singh");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testapps.demo123@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@Test
	public void tc_CAF_007_Different_Password_PasswordAgain() {
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Tajinder Singh");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testapps.demo123@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heytest");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@Test
	public void tc_CAF_014_Empty_Password_And_Password_Again() {
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Tajinder Singh");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testapps.demo123@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}*/
	
	/*@Test
	public void tc_CAF_008_Provide_Invalid_Email_Rest_Valid() {
		
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Taj Si");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testingapps.demo@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@Test
	public void tc_CAF_009_Email_Already_Taken() {
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Taj Si");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testingapps.demo@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heytesting");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@Test
	public void tc_CAF_010_Password_Less_Than_6_Characters() {
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element, 5, 5).perform();
		driver.findElement(
				By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Taj Si");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testapps.demo123@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heyte");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Heyte");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}*/

}
