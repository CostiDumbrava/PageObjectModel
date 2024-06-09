package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;
import selenium.utils.SeleniumWrappers;

public class LoginTestHomework extends BaseTest {
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user","credentials.properties");
	String 	PASS = PropertiesFileProcessor.readPropertiesFile("pass","credentials.properties");
	
	
	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException {
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
		
		assertTrue(loginPage.checkMsgIsDisplayed(loginPage.successLoginMsg));
		
		loginPage.click(loginPage.submitBtn);
		
		Thread.sleep(5000);
	}
}
