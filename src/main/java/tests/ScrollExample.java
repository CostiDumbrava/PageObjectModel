package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ScrollExample extends BaseTest{
	
	//@Test
	public void scrollByAmount() throws InterruptedException {
		//JS Executor Scroll - java script executor
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 2500)");  //dezavantajul la jse este ca nu iti ofera indicii ce sa scrii in parametru, dar in Console de la browser poti gasi functionalitati
		
		Thread.sleep(4000);
		
		//Action class scroll
		Actions action = new Actions(driver);
		
	                         //x, y	
		action.scrollByAmount(0,1500).perform(); // coboara 1500 de px
		
		Thread.sleep(4000);
		
		action.scrollByAmount(0,-1500).perform(); // urca
	}
	
	//@Test
	public void scrollToElement() {
		
		Actions action = new Actions(driver);
		WebElement text = driver.findElement(By.xpath("//h4//em[text()='Picked']"));
		
		//jse executor scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", text);
		
		
		//action class scroll
		//action.scrollToElement(text).perform(); sau putem folosi
		//action.moveToElement(text).perform(); 
		
	}
		
	@Test	
	public void scrollDownAndTop() throws InterruptedException {
		
		//jse executor scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(4000);
	    jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	    Thread.sleep(4000);
	    
	    
	   //action class scroll
		Actions action = new Actions(driver);
		action.sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		action.sendKeys(Keys.HOME).perform();
		
	}	
		
	}
	

