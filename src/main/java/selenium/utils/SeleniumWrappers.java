package selenium.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTest { //extinde BaseTest pentru a avea acces la EebElement
	
	//WebElement element = driver.findElelemnt(locator)
	//element.click();
	
	public void click(By locator) { //clasa By se importa
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement element = driver.findElement(locator);
			element.click();
			
		}catch(NoSuchElementException e) {
			
			
		}
		
		
		
	}

}
