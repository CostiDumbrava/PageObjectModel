package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.objects.ContactsPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class ActionClassExample2 extends BaseTest{
	
	//@Test
	public void sendKeysExample() {
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.contactsLink);
		
		ContactsPage contactsPage = new ContactsPage(driver);
		WebElement nameField = driver.findElement(contactsPage.nameField);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(nameField)
		      .click()
		      .keyDown(Keys.SHIFT) //scrie cu CAPS
		      .sendKeys(nameField, "test")
		      .keyUp(Keys.SHIFT)
		      .sendKeys(Keys.TAB, "email@email.com")
		      .sendKeys(Keys.TAB, "Subject")
		      .sendKeys(Keys.TAB, "Message")
		      .sendKeys(Keys.TAB, Keys.ENTER)
		      .perform();
			
	}

	@Test
	public void sendKeysExample2() throws InterruptedException {
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.contactsLink);
		
		ContactsPage contactsPage = new ContactsPage(driver);
		WebElement nameField = driver.findElement(contactsPage.nameField);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(nameField)
		      .sendKeys(nameField, "ABRACADABRA")
		      .keyDown(Keys.SHIFT)
		      .sendKeys(Keys.ARROW_LEFT)
		      .sendKeys(Keys.ARROW_UP) //selectez textul
		      .keyUp(Keys.SHIFT)
		          .keyDown(Keys.CONTROL)
		          .sendKeys("c")
		          .keyUp(Keys.CONTROL)
		      .sendKeys(Keys.TAB)
		          .keyDown(Keys.CONTROL)
		          .sendKeys("v")
		      .perform();
		
		
		Thread.sleep(4000);
		
		
		
	}
	
	
}
