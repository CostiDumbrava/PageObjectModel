package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import page.objects.ShippingAddressPage;
import page.objects.ShopPage;
import page.objects.SingleAuthorPage;
import selenium.utils.BaseTest;
import selenium.utils.SeleniumWrappers;

public class ShippingAddressPageTest extends BaseTest {
	
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
		
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void shippingTest() throws InterruptedException {
		
		ShippingAddressPage shippingAddressPage = new ShippingAddressPage(driver);
		
		driver.get("https://keybooks.ro/account/edit-address/shipping/");
		
		Thread.sleep(1000);
		
		shippingAddressPage.selectByIndex(41);
		
		Thread.sleep(1000);
			
		assertEquals(shippingAddressPage.getSelectOptionIndex(), "Canada");	
		
		Thread.sleep(1000);
			
		shippingAddressPage.selectByValue("NL");
			
		assertEquals(shippingAddressPage.getSelectOptionValue(),"Newfoundland and Labrador");	
		
		Thread.sleep(1000);
			
			
		}
	
	}
	

