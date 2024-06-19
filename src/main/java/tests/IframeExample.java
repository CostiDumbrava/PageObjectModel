package tests;

import org.testng.annotations.Test;

import page.objects.ContactsPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;

//ca stii daca ai un iframe il cauti in inspector dupa denumirea iframe

public class IframeExample extends BaseTest {
	
	
	@Test
	public void iframeExampleTest() throws InterruptedException {  //un iframe este un document in alt document, este un tag care tine in interiorul sau alta pagina web, alt DOM
	
		MenuPage menu = new MenuPage(driver);
		menu.click(menu.contactsLink);
		
		ContactsPage contactPage = new ContactsPage(driver);
		
		
		
		driver.switchTo().frame(driver.findElement(contactPage.iframe));
		
		contactPage.click(contactPage.zoomInBtn);
		contactPage.click(contactPage.zoomInBtn);
		
		driver.switchTo().defaultContent(); // se intoarce in primul DOM, altfel ramane in DOM ul cu google maps si nu functioneaza alta selectie din pagina..
		
	}

}
