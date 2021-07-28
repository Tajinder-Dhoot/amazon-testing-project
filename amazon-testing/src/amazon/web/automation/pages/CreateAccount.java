package amazon.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import amazon.web.automation.utilities.PageActions;
import amazon.web.automation.utilities.PropertyReader;

public class CreateAccount {
	
	WebDriver driver = null;
	PageActions pageAction = null;
	
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		pageAction = new PageActions(driver);
	}

	public void clickCreateAccountButton() {
		
		try {
			pageAction.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("create_your_amazon_account_button_xpath"))));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception-----------------");
			e.printStackTrace();
		}
	}

	public void enterValidYourName() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("your_name_xpath"))),
					PropertyReader.readConfigProperty("valid_your_name"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}
	
	public void enterEmptyYourName() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("your_name_xpath"))),
					PropertyReader.readConfigProperty("empty_your_name"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}

	public void entervalidEmail() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("email_xpath"))),
					PropertyReader.readConfigProperty("valid_email"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}
	
	public void enterEmptyEmail() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("email_xpath"))),
					PropertyReader.readConfigProperty("empty_email"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}

	public void enterValidPassword() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("password_xpath"))),
					PropertyReader.readConfigProperty("valid_password"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}
	
	public void enterEmptyPassword() {
	
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("password_xpath"))),
					PropertyReader.readConfigProperty("empty_password"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}
	
	public void enterValidPasswordAgain() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("password_again_xpath"))),
					PropertyReader.readConfigProperty("valid_password_again"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}
	
	public void enterEmptyPasswordAgain() {
		
		try {
			pageAction.enterDataIntoTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementLocator("password_again_xpath"))),
					PropertyReader.readConfigProperty("empty_password_again"));
		} 
		catch (Exception e) {
			System.out.println("-------------Exception--------------");
			e.printStackTrace();
		}
	}
}
 