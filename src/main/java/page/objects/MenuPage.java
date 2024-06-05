package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	//driver.findElement(By.linkText('Login'));
	public By loginLink = By.linkText("Login"); // nu este un web element, este un locator
	public By shopLink = By.linkText("BOOKS");// tot locator
	public By contactsLink = By.linkText("CONTACTS");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	

}
