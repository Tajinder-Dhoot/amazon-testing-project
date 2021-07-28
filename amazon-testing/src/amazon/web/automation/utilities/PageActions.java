package amazon.web.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageActions {
	
	WebDriver driver = null;
	Actions action = null;

	public PageActions(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);

	}

	public void enterDataIntoTextBox(WebElement element, String text) {
		try {

			element.sendKeys(text);

		} 
		catch (Exception e) {
			System.out.println("-----------Exception----------------");
			e.printStackTrace();
		}
	}
	
	public void clickButton(WebElement element) {
		try {
			element.click();

		} 
		catch (Exception e) {
			System.out.println("-----------Exception----------------");
			e.printStackTrace();
		}
	}
	
	public void hoverOnElement(WebElement element) {
		action.moveToElement(element, 5, 5).perform();
	}
}