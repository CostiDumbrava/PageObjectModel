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

import page.objects.SearchPage;
import page.objects.SingleAuthorPage;
import selenium.utils.BaseTest;
import selenium.utils.SeleniumWrappers;

public class SearchFieldTest extends BaseTest {
	
	
	@Test
	public void searchBook() throws InterruptedException {
	SearchPage searchPage = new SearchPage(driver);
	
	searchPage.title("king");
	Thread.sleep(3000);
	
	driver.findElement(searchPage.selectBook).click();
	
	assertEquals(searchPage.getElementText(searchPage.category),"New releases");
	assertEquals(searchPage.getElementText(searchPage.productID),"Product ID: 1709");
	
	driver.findElement(searchPage.Img1).click();
	driver.findElement(searchPage.magnifier).click();
	assertEquals(searchPage.getElementText(searchPage.textImg),"TheWickedKing1");
	Thread.sleep(3000);
	driver.findElement(searchPage.closeBtn).click();
	
	driver.findElement(searchPage.Img2).click();
	driver.findElement(searchPage.magnifier).click();
	assertEquals(searchPage.getElementText(searchPage.textImg),"TheWickedKing3");
	Thread.sleep(3000);
	driver.findElement(searchPage.closeBtn).click();
	
	driver.findElement(searchPage.Img3).click();
	driver.findElement(searchPage.magnifier).click();
	assertEquals(searchPage.getElementText(searchPage.textImg),"TheWickedKing4");
	Thread.sleep(3000);
	driver.findElement(searchPage.closeBtn).click();
	
	driver.findElement(searchPage.Img4).click();
	driver.findElement(searchPage.magnifier).click();
	assertEquals(searchPage.getElementText(searchPage.textImg),"TheWickedKing2");
	Thread.sleep(3000);
	driver.findElement(searchPage.closeBtn).click();
	
	
	}

}
