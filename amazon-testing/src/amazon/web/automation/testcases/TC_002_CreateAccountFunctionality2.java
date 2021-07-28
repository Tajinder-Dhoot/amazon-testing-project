package amazon.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import amazon.web.automation.base.InstanciateDriver;

public class TC_002_CreateAccountFunctionality2 extends InstanciateDriver{
	
	
	@Test
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
}