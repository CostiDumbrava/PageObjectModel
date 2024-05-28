package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//driver.findElement(By.linkText('Login'));
	public By loginLink = By.linkText("Login"); // nu este un web element, este un locator
	public By shopLink = By.linkText("BOOKS");// tot locator
	
	public void navigateTo(By locator) {
		
		driver.findElement(locator).click();
		
	}
	

}
