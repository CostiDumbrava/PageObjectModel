package tests;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page.objects.ShopPage;
import page.objects.SingleAuthorPage;
import selenium.utils.BaseTest;
import selenium.utils.SeleniumWrappers;

public class ShopNewReleasesTest extends BaseTest {
	
	
	@Test
	public void searchBook() throws InterruptedException {
	ShopPage shopNewReleasesPage = new ShopPage(driver);
	
	shopNewReleasesPage.title("king");
	Thread.sleep(3000);
	
	driver.findElement(shopNewReleasesPage.selectBook).click();
	
	assertEquals(shopNewReleasesPage.getElementText(shopNewReleasesPage.category),"New releases");
	assertEquals(shopNewReleasesPage.getElementText(shopNewReleasesPage.productID),"Product ID: 1709");
	
	driver.findElement(shopNewReleasesPage.Img1).click();
	driver.findElement(shopNewReleasesPage.magnifier).click();
	assertEquals(shopNewReleasesPage.getElementText(shopNewReleasesPage.textImg),"TheWickedKing1");
	Thread.sleep(3000);
	driver.findElement(shopNewReleasesPage.closeBtn).click();
	
	driver.findElement(shopNewReleasesPage.Img2).click();
	driver.findElement(shopNewReleasesPage.magnifier).click();
	assertEquals(shopNewReleasesPage.getElementText(shopNewReleasesPage.textImg),"TheWickedKing3");
	Thread.sleep(3000);
	driver.findElement(shopNewReleasesPage.closeBtn).click();
	
	driver.findElement(shopNewReleasesPage.Img3).click();
	driver.findElement(shopNewReleasesPage.magnifier).click();
	assertEquals(shopNewReleasesPage.getElementText(shopNewReleasesPage.textImg),"TheWickedKing4");
	Thread.sleep(3000);
	driver.findElement(shopNewReleasesPage.closeBtn).click();
	
	driver.findElement(shopNewReleasesPage.Img4).click();
	driver.findElement(shopNewReleasesPage.magnifier).click();
	assertEquals(shopNewReleasesPage.getElementText(shopNewReleasesPage.textImg),"TheWickedKing2");
	Thread.sleep(3000);
	driver.findElement(shopNewReleasesPage.closeBtn).click();
	
	
	}

}
