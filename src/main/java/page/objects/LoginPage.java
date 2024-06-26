package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers  {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//locators
	
	public By userField = By.id("log");
	public By passField = By.id("password");
	public By submitBtn = By.cssSelector("input[value='Login']");
	public By successLoginMsg = By.cssSelector("div[class*='sc_infobox_style_success']"); //mesajul cand te ai logat cu succes
	public By errorLoginMsg = By.cssSelector("div[class*='sc_infobox_style_error']");//mesajul cand nu e corect userul sau parola
	public By logoutBtn = By.linkText("Logout");
	public By closeLoginBtn = By.xpath("//ul//a[@class='popup_close']");
	
    //metode
	public void loginInApp(String username, String password) {
		
		//driver.findElement(userField).sendKeys(username);
		//driver.findElement(passField).sendKeys(password);
	sendKeys(userField,username);
	sendKeys(passField,password);
	click(submitBtn);
		
	}
	
	public boolean checkMsgIsDisplayed(By locator) {
		
		return driver.findElement(locator).isDisplayed();		
		
	}
	/*public void logoutFromApp() {
	driver.findElement(logoutBtn).click();
		
	}*/
}
