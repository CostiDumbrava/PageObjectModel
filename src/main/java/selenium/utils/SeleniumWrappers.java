package selenium.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.objects.ShopPage;

public class SeleniumWrappers extends BaseTest { //extinde BaseTest pentru a avea acces la EebElement
	
	//WebElement element = driver.findElelemnt(locator)
	//element.click();
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	
	public void click(By locator) { //clasa By se importa
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement element = driver.findElement(locator);
			element.click();
			
		}catch(NoSuchElementException e) {
			
			
		}
	}
   public void sendKeys(By locator, String text) {
	   

		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement element = driver.findElement(locator);
			element.sendKeys(text);
			
		}catch(NoSuchElementException e) {
			
			
		}
	   
   }
   
   public String getElementText(By locator) {
	   
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    return driver.findElement(locator).getText();
   }
   public void hoverElement(By locator) {
	 
	   WebElement element = driver.findElement(locator);
	 Actions action = new Actions(driver);
	 
	 action.moveToElement(element).perform(); // in totdeauna avem nevoie de perform in clasa action la final, altfel nu se executa, dar nici nu da eroare ca sa stim de ce nu merge  
	   
   }
   
   public void dragAndDrop(By locator, int x, int y) {
	   WebElement element = driver.findElement(locator);
		 Actions action = new Actions(driver);
		 action.moveToElement(element).clickAndHold(element).moveByOffset(x, y).release().perform(); //intodeauna perform la final cand folosim clasa action
	   
	   
   }
   
}
