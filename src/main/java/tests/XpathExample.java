package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import selenium.utils.BaseTest;

public class XpathExample extends BaseTest{
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user","credentials.properties");
	String 	PASS = PropertiesFileProcessor.readPropertiesFile("pass","credentials.properties");
	
	/*
	 * CSS:
	 *   ex:  li[calss='menu_user_login']
	 * 
	 * XPATH:
	 *  ex:  //li[@class='menu_user_login']
	 *  
	 *  
	 *  
	 */

	@Test(priority=1)
	public void xpatheExample() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		WebElement loginButton = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", loginButton);
		loginButton.click();
		
		WebElement userField = driver.findElement(By.xpath("//ul//input[@id='log' or @name='log']")); //logical OR
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", userField);
		userField.sendKeys(USER);
	
}
	
	
}