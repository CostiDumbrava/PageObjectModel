package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import page.objects.EventPage;
import selenium.utils.BaseTest;

public class WindowHandleExample extends BaseTest{
	
	@Test
	public void windowHandleTest() throws InterruptedException {
	
	driver.get("https://keybooks.ro/event/time-for-books-discussion/");	
	
	EventPage event = new EventPage(driver);
	
	event.scrollVertically(800);
	driver.switchTo().frame(driver.findElement(event.iframe));
	
	System.out.println("Before: " +driver.getWindowHandle()); // are 1 fereastra aici
	
	event.click(event.viewMapBtn);
	
	System.out.println("After: " +driver.getWindowHandle()); // a ramas tot in prima fereastra
	
	System.out.println("All windows:" + driver.getWindowHandles()); // are 2 ferestere aici 
	
	List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
	
	Thread.sleep(4000);
		
	driver.switchTo().window(browserTabs.get(1)); //face switch catre noul tab
	
	driver.close();
	
	driver.switchTo().window(browserTabs.get(0)); // m am intors in primul tab, altfel nu pot da click din nou pe un element din DOM ul in care ma aflam la inceput
	event.click(event.viewMapBtn);
	
	}

}
