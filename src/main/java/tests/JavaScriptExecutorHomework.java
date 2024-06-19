package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class JavaScriptExecutorHomework extends BaseTest {
	
	@Test
	public void homeworkJS() throws InterruptedException {
	 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.location='https://keybooks.ro'");
		
		String jsHover = "var obj = document.createEvent('MouseEvent');"
				+ "obj.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obj);";
		MenuPage menu =  new MenuPage(driver);

		jse.executeScript(jsHover, menu.getWebElement(menu.blogLink));
		Thread.sleep(2000);
		
		jse.executeScript("document.getElementById('menu-item-232').click()");
		
		jse.executeScript("window.scrollBy(0,2450)");
		
		Thread.sleep(2000);
		
 		jse.executeScript("window.location='https://keybooks.ro/2016/02/01/gallery-format/'");
		
	   Thread.sleep(2000);
		
	   jse.executeScript("window.scrollBy(0, 3000)");
		
	   Thread.sleep(2000);
	    
	   jse.executeScript("document.getElementById('comment').click()");
	   jse.executeScript("document.getElementById('comment').value='Carti interesante!'");
	   
	   Thread.sleep(2000);
	   jse.executeScript("document.getElementById('author').click()");	
	   jse.executeScript("document.getElementById('author').value='Ion'");
	     
	   Thread.sleep(2000);
	   jse.executeScript("document.getElementById('email').click()");	
	   jse.executeScript("document.getElementById('email').value='ion@ionescu.com'");
	   
	   Thread.sleep(2000);
	   jse.executeScript("document.getElementById('send_comment').click()");	
	
		String visible = jse.executeScript ("return document.getElementsByClassName('comment_text')[0].checkVisibility()").toString();
		
		boolean isElementVisible = Boolean.parseBoolean(visible);
		
		assertTrue(isElementVisible);
				
	}

				
}